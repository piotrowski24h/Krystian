package com.kodilla.stream.portfolio;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTestSuite {
    @Test
    void testAddTaskData() {
        //give
        Board project = prepareTestData();
        //when

        //then
        assertEquals(3, project.getTaskLists().size());
    }
private Board prepareTestData() {
        //users
    User user1 = new User("developer1", "John Smith");
    User user2 = new User("projectmanager1", "Nina White");
    User user3 = new User("developer2", "Emilia Stephanson");
    User user4 = new User("developer3", "Konrad Bridge");

    //tasks
    Task task1 = new Task("Microservice for taking temperature",
            "Write and test the microservice taking\n" +
                    "the temperaure from external service",
            user1,
            user2,
            LocalDate.now().minusDays(20),
            LocalDate.now().plusDays(30));
    Task task2 = new Task("HQLs for analysis",
            "Prepare some HQL queries for analysis",
            user1,
            user2,
            LocalDate.now().minusDays(20),
            LocalDate.now().minusDays(5));
    Task task3 = new Task("Temperatures entity",
            "Prepare entity for temperatures",
            user3,
            user2,
            LocalDate.now().minusDays(20),
            LocalDate.now().plusDays(15));
    Task task4 = new Task("Own logger",
            "Refactor company logger to meet our needs",
            user3,
            user2,
            LocalDate.now().minusDays(10),
            LocalDate.now().plusDays(25));
    Task task5 = new Task("Optimize searching",
            "Archive data searching has to be optimized",
            user4,
            user2,
            LocalDate.now(),
            LocalDate.now().plusDays(5));
    Task task6 = new Task("Use Streams",
            "use Streams rather than for-loops in predictions",
            user4,
            user2,
            LocalDate.now().minusDays(15),
            LocalDate.now().minusDays(2));
    //taskLists
    TaskList taskListToDo = new TaskList("To do");
    taskListToDo.addTask(task1);
    taskListToDo.addTask(task3);
    TaskList taskListInProgress = new TaskList("In progress");
    taskListInProgress.addTask(task5);
    taskListInProgress.addTask(task4);
    taskListInProgress.addTask(task2);
    TaskList taskListDone = new TaskList("Done");
    taskListDone.addTask(task6);

    //board
    Board project = new Board("Project Weather Prediction");
    project.addTaskList(taskListToDo);
    project.addTaskList(taskListInProgress);
    project.addTaskList(taskListDone);
    return project;
    }

    @Test
    void testAddTaskListFindUsersTasks() {
        //Given
        Board project = prepareTestData();

        //When
        User user = new User("developer1", "John Smith");
        List<Task> tasks = project.getTaskLists().stream()
                .flatMap(l -> l.getTasks().stream())
                .filter(t -> t.getAssignedUser().equals(user))
                .collect(toList());

        //Then
        assertEquals(2, tasks.size());
        assertEquals(user, tasks.get(0).getAssignedUser());
        assertEquals(user, tasks.get(1).getAssignedUser());
    }
    @Test
    void testAddTaskListFindOutdatedTasks() {
        //Given
        Board project = prepareTestData();

        //When
        List<TaskList> undoneTasks = new ArrayList<>();
        undoneTasks.add(new TaskList("To do"));
        undoneTasks.add(new TaskList("In progress"));
        List<Task> tasks = (List<Task>) project.getTaskLists().stream()
                .filter(undoneTasks::contains)
                .flatMap(tl -> tl.getTasks().stream())
                .filter(t -> t.getDeadline().isBefore(LocalDate.now()))
                .collect(toList());

        //Then
        assertEquals(1, tasks.size());
        assertEquals("HQLs for analysis", tasks.get(0).getTitle());
    }
    @Test
    void testAddTaskListFindLongTasks() {
        //Given
        Board project = prepareTestData();

        //When
        List<TaskList> inProgressTasks = new ArrayList<>();               // [1]
        inProgressTasks.add(new TaskList("In progress"));                 // [2]
        long longTasks = project.getTaskLists().stream()                  // [3]
                .filter(inProgressTasks::contains)                             // [4]
                .flatMap(tl -> tl.getTasks().stream())                         // [5]
                .map(Task::getCreated)                                         // [6]
                .filter(d -> d.compareTo(LocalDate.now().minusDays(10)) <= 0)  // [7]
                .count();                                                      // [8]

        //Then
        assertEquals(2, longTasks);                                       // [9]
    }

//    @Test
//   void testAddTaskListAverageWorkingOnTask(){
//        //give
//        Board project = prepareTestData();                      //sprawdzic sobie test
//
//        //when
//        List<TaskList> inProgressTasks =new ArrayList<>();
//        inProgressTasks.add(new TaskList("in progress"));
//        long allDaysPass = project.getTaskLists().stream()
//                .filter(inProgressTasks::contains)
//                .flatMap(tl -> tl.getTasks().stream())
//                .map(t -> t.getDeadline())
//                .filter(d -> d.isBefore(LocalDate.now().minusDays(10)))
//                .count();
//        long taskCount = project.getTaskLists().stream()
//                .filter(inProgressTasks::contains)
//                .flatMap(tl->tl.getTasks().stream())
//                .map(t->t.getCreated())
//                .count();
//
//        double averageAllDaysPass = (double)(allDaysPass/ taskCount);
//
//        //then
//        assertEquals(10.0,averageAllDaysPass);
//
//
//        }
   @Test
    void testAddTaskListAverageWorkingOnTask(){
    // Given

    Board project = prepareTestData();

    //When
    List<TaskList> inProgessTasks = new ArrayList<>();
        inProgessTasks.add(new TaskList("In progress"));
    long totalDaysPass = project.getTaskLists().stream()
            .filter(inProgessTasks::contains)
            .flatMap(tl -> tl.getTasks().stream())
            .map(t -> t.getCreated().until(LocalDate.now()))
            .reduce((sum, current) -> sum = sum.plus(current)).get().getDays();
    long tasksCount = project.getTaskLists().stream()
            .filter(inProgessTasks::contains)
            .flatMap(tl -> tl.getTasks().stream())
            .map(t -> t.getCreated())
            .count();

       double averageAllDaysPass = (double)(totalDaysPass/tasksCount);

       //Then
       assertEquals(10.0, averageAllDaysPass);
   }

    private long betweenDays(LocalDate start) {
        return ChronoUnit.DAYS.between(start, LocalDate.now());
    }

    private  Board prepareTestDate() {
        //users
        User user1 = new User("uczen1", "J.Born");
        User user2 = new User("uczen2", "Adam Kowalski");
        User user3 = new User("uczen3", "Jan Kowalski");
        User user4 = new User("uczen4", "Anna Nowak");

        //task
        Task task1 = new Task("Microservice for taking temperature",
                "Wrte and test the microservice taking\n" +
                        "the temperature form external servie",
                user1,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().plusDays(30));

        //task2
        Task task2 = new Task("HQLs for analysis",
                "Prepare some HQL queries for analysis",
                user1,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().minusDays(5));
         //task3
        Task task3 = new Task("Temperatures entity",
                "Preapre entity for temperatures",
                user3,
                user4,
        LocalDate.now().minusDays(20),
                LocalDate.now().plusDays(10));

         //task4
        Task task4 = new Task("Own logger",
                "Refactor company logger to meet our needs",
                user2,
                user3,
                LocalDate.now().minusDays(15),
                LocalDate.now().plusDays(25));


         //taskLists
    TaskList taskListToFinish = new TaskList("To finish");
    taskListToFinish.addTask(task1);
    taskListToFinish.addTask(task2);
    TaskList taskLisLProgressFinish = new TaskList("Progress Finish");
    taskLisLProgressFinish.addTask(task3);
    TaskList taskListFinishFinish =new TaskList("Finish Finish");


    //board

    Board project = new Board(("Project 1"));
    project.addTaskList(taskListToFinish);
    project.addTaskList(taskLisLProgressFinish);
    project.addTaskList(taskListFinishFinish);
    return project;
    }



}

