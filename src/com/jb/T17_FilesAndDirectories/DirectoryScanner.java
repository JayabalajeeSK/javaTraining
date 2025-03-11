// package com.jb.T17_FilesAndDirectories;
// import java.io.IOException;
// import java.nio.file.Files;
// import java.nio.file.Path;
// import java.nio.file.Paths;
// //c import java.nio.file.attribute.BasicFileAttributeView;
// import java.nio.file.attribute.BasicFileAttributes;
// import java.util.function.BiPredicate;
// c import java.util.function.Predicate;
// public class DirectoryScanner {
//     public static void main(String[] args) throws IOException{
//         c Path currentDir=Paths.get(".");
//         Files.list(currentDir).forEach(System.out::println);
//          Predicate <? super Path> predicate = path -> String.valueOf(path).contains(".java");
//         Files.walk(currentDir, 5).filter(predicate).forEach(System.out::println);
        
//         c
//         BiPredicate <Path, BasicFileAttributes> matcher =(path,attribute) -> String.valueOf(path).contains(".java");
//         BiPredicate <Path, BasicFileAttributes> matcher1 =(path1,attribute1) -> attribute1.isDirectory();
//         Files.find(currentDir, 5,  matcher).forEach(System.out::println);
//         Files.find(currentDir, 2,  matcher1).forEach(System.out::println);
//     }   
// }
// .\src\com\jb\T00CodingExercises\C01HelloCoding.java
// .\src\com\jb\T00CodingExercises\C02HelloWorld.java
// .\src\com\jb\T00CodingExercises\C03TimeConverter.java
// .\src\com\jb\T00CodingExercises\C04ExamResult.java
// .\src\com\jb\T00CodingExercises\C05SumOfSquares.java
// .\src\com\jb\T00CodingExercises\C06DimensionFeetInches.java
// .\src\com\jb\T00CodingExercises\C07SquareAreaPerimeter.java
// .\src\com\jb\T00CodingExercises\C08DistanceBw2Points.java
// .\src\com\jb\T00CodingExercises\C09RGBColorInvert.java
// .\src\com\jb\T00CodingExercises\C10TriangleValidator.java
// .\src\com\jb\T00CodingExercises\C11RightAngleTriangleValidator.java
// .\src\com\jb\T00CodingExercises\C12LeapYearChecker.java
// .\src\com\jb\T00CodingExercises\C13PerfectNumberChecker.java
// .\src\com\jb\T00CodingExercises\C14StudentGrade.java
// .\src\com\jb\T00CodingExercises\C15WeatherAdviser.java
// .\src\com\jb\T00CodingExercises\C16VowelOrNot.java
// .\src\com\jb\T05OOPS\Planet.java
// .\src\com\jb\T05OOPS\Planet1.java
// .\src\com\jb\T05OOPS\Planet2.java
// .\src\com\jb\T05OOPS\Planet3.java
// .\src\com\jb\T05OOPS\Planet4.java
// .\src\com\jb\T06DataTypes\Character.java
// .\src\com\jb\T06DataTypes\Integer.java
// .\src\com\jb\T06DataTypes\SimpleInterest.java
// .\src\com\jb\T07Conditionals\IfandSwitch.java
// .\src\com\jb\T07Conditionals\WeekCalender.java
// .\src\com\jb\T08Loops\CubesOfNumbersTillN.java
// .\src\com\jb\T08Loops\FindCubeNumber.java
// .\src\com\jb\T08Loops\N_NumberTriangle.java
// .\src\com\jb\T08Loops\PrimeNumber.java
// .\src\com\jb\T08Loops\SquaresOfNumbersTillN.java
// .\src\com\jb\T08Loops\SumOfDivisorOfN.java
// .\src\com\jb\T08Loops\SumOfN_Numbers.java
// .\src\com\jb\T10ArrayArrayList\Array.java
// .\src\com\jb\T10ArrayArrayList\ArrayListStudent.java
// .\src\com\jb\T10ArrayArrayList\Student.java
// .\src\com\jb\T10ArrayArrayList\WeekDays.java
// .\src\com\jb\T11OOPSAgain\AbstractRecipe.java
// .\src\com\jb\T11OOPSAgain\Address.java
// .\src\com\jb\T11OOPSAgain\AnimalRunner.java
// .\src\com\jb\T11OOPSAgain\ChessGame.java
// .\src\com\jb\T11OOPSAgain\ComplexAlgorithm.java
// .\src\com\jb\T11OOPSAgain\Customer.java
// .\src\com\jb\T11OOPSAgain\DummyAlgorithm.java
// .\src\com\jb\T11OOPSAgain\Employee.java
// .\src\com\jb\T11OOPSAgain\Fan.java
// .\src\com\jb\T11OOPSAgain\FlyableRunner.java
// .\src\com\jb\T11OOPSAgain\GameRunner.java
// .\src\com\jb\T11OOPSAgain\GamingConsole.java
// .\src\com\jb\T11OOPSAgain\MarioGame.java
// .\src\com\jb\T11OOPSAgain\MotorBike.java
// .\src\com\jb\T11OOPSAgain\Person.java
// .\src\com\jb\T11OOPSAgain\Project.java
// .\src\com\jb\T11OOPSAgain\RealAlgorithm.java
// .\src\com\jb\T11OOPSAgain\Recipe1.java
// .\src\com\jb\T11OOPSAgain\RecipeWithMicroWave.java
// .\src\com\jb\T11OOPSAgain\Rectangle.java
// .\src\com\jb\T11OOPSAgain\Student.java
// .\src\com\jb\T12Collections\characters.java
// .\src\com\jb\T12Collections\CountChar.java
// .\src\com\jb\T12Collections\FindUniqueChar.java
// .\src\com\jb\T12Collections\MapDemo.java
// .\src\com\jb\T12Collections\NavigableSet.java
// .\src\com\jb\T12Collections\QueueDemo.java
// .\src\com\jb\T12Collections\SetDemo.java
// .\src\com\jb\T12Collections\SortingList.java
// .\src\com\jb\T12Collections\Student.java
// .\src\com\jb\T13Generics\GenericsRunner.java
// .\src\com\jb\T13Generics\MyCustomList.java
// .\src\com\jb\T14FunctionalProgramming\CubeLowerUpperOperation.java
// .\src\com\jb\T14FunctionalProgramming\EvenOddFPDemoListOfNo.java
// .\src\com\jb\T14FunctionalProgramming\FPOperation.java
// .\src\com\jb\T14FunctionalProgramming\FunctionalProRunner.java
// .\src\com\jb\T14FunctionalProgramming\MaxMin.java
// .\src\com\jb\T14FunctionalProgramming\SumOfListOfNumbers.java
// .\src\com\jb\T14FunctionalProgramming\SumOfOddandEven.java
// .\src\com\jb\T15ThreadsAndConcurrency\CallableRunner.java
// .\src\com\jb\T15ThreadsAndConcurrency\ExecutorServiceRunner.java
// .\src\com\jb\T15ThreadsAndConcurrency\ExecutorServiceRunner1.java
// .\src\com\jb\T15ThreadsAndConcurrency\MultipleCallableRunner.java
// .\src\com\jb\T15ThreadsAndConcurrency\ThreadDemo.java
// .\src\com\jb\T16ExceptionHandling\Amount.java
// .\src\com\jb\T16ExceptionHandling\CheckedExceptionRunner.java
// .\src\com\jb\T16ExceptionHandling\ExceptionHandlingDemo.java
// .\src\com\jb\T16ExceptionHandling\FinalluDemo.java
// .\src\com\jb\T16ExceptionHandling\LessCode.java
// .\src\com\jb\T16ExceptionHandling\ThrowingExceptionRunner.java
// .\src\com\jb\T17_FilesAndDirectories\DirectoryScanner.java
// .\src\module-info.java
// .
// .\.settings
// .\bin
// .\bin\com
// .\Java
// .\Java\.metadata
// .\Java\00_CodingExercises
// .\Java\01_JShell
// .\Java\02_JavaMethodWithMultiplicationTable
// .\Java\03_JavaPlatform
// .\Java\04_Eclipse
// .\Java\16_ExceptionHandling
// .\Java\17_FilesAndDirectories
// .\Java\18_MoreConcurrencyWithConcurrentCollectionsAndAtomicOperations
// .\Java\19_JavaTips
// .\Java\20_JavaNEwFeatures_Java10ToJava16
// .\Java\Notes
// .\src
// .\src\com