# MVVM-RoomDB-using-Java
MVVM with RoomDB using Java

## What is MVVM?

- MVVM stands for Model View ViewModel and it is a design pattern that is used to build softwares applications.
- MVVM helps us to separate the Business Logic of our Application from the Views or UI.
- It losses the tight coupling between each component.
- Works on the concept of observables.
- Children don't have reference to the parent, they only have reference by observables.

__Model__

- This is responsible for handling the data in the application. 
- It is business logic and Data State. 
- Model cannot directly interact with Views, but it interacts with ViewModels and then Views with the help of observables.

__View__

- This is the User Interface of our Application. 
- It should not contain any application logic.

__ViewModel__

- It is basically a link between Model and View.
- It handles the communication of the view with the rest of the application (calling the business logic classes) and exposes the states/data to whomever needs to consume it       using LiveData.

## Uses

- If you use MVVM it will help you structuring your code in a nice way so that it is easy to understand for a new developer.
- Using MVVM makes your project maintainable as everything is well organized and making changes are very easy.
- Testability is easy with MVVM because all modules are independent and testable.
- MVVM enhances the re-usability of the code.

## Advantages

- No tight coupling between the view and view model
- No interfaces between view and model.
- Easy to unit testing and code is event-driven.

## Disadvantage

- You have to create observables for each UI component.
- The code size is quite excessive.


