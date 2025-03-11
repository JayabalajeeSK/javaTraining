package com.jb.T12Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student implements Comparable<Student> 
{
    private int id;
    private String name;

    Student(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Student that) {
        return Integer.compare(this.id, that.id);
    }

    // Static nested comparator class for descending order
    static class DescendingStudentComparator implements Comparator<Student>
    {
        @Override
        public int compare(Student student1, Student student2) {
            return Integer.compare(student2.getId(), student1.getId());  // Descending order
        }
    }

    public static void main(String[] args) {
        List<Student> students = List.of(
            new Student(1, "jaya"),
            new Student(4, "Bala"),
            new Student(2, "JB"),
            new Student(5, "Tharun"),
            new Student(3, "Eva")
        );

        System.out.println("Original List: " + students);

        ArrayList<Student> studentsAL = new ArrayList<>(students);
        System.out.println("ArrayList before sorting: " + studentsAL);

        // Ascending sort (default Comparable sorting by id)
        Collections.sort(studentsAL);
        System.out.println("ASC: " + studentsAL);

        // Descending sort using comparator
        studentsAL.sort(new DescendingStudentComparator());
        System.out.println("DESC: " + studentsAL);
    }
}
// Original List: [Student [id=1, name=jaya], Student [id=4, name=Bala], Student [id=2, name=JB], Student [id=5, name=Tharun], Student [id=3, name=Eva]] 
// ArrayList before sorting: [Student [id=1, name=jaya], Student [id=4, name=Bala], Student [id=2, name=JB], Student [id=5, name=Tharun], Student [id=3, name=Eva]]
// ASC: [Student [id=1, name=jaya], Student [id=2, name=JB], Student [id=3, name=Eva], Student [id=4, name=Bala], Student [id=5, name=Tharun]]
// DESC: [Student [id=5, name=Tharun], Student [id=4, name=Bala], Student [id=3, name=Eva], Student [id=2, name=JB], Student [id=1, name=jaya]]