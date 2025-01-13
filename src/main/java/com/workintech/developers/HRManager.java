package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("HRManager starts to working");
    }

    // JuniorDeveloper eklemek için overload edilmiş addEmployee metodu
    public void addEmployee(JuniorDeveloper juniorDeveloper, int index) {
        if (index >= juniorDevelopers.length) {
            System.out.println("Index out of bounds for juniorDevelopers array.");
            return;
        }
        if (juniorDevelopers[index] != null) {
            System.out.println("JuniorDeveloper at index " + index + " already exists.");
        } else {
            juniorDevelopers[index] = juniorDeveloper;
            System.out.println("JuniorDeveloper added at index " + index);
        }
    }

    // MidDeveloper eklemek için overload edilmiş addEmployee metodu
    public void addEmployee(MidDeveloper midDeveloper, int index) {
        if (index >= midDevelopers.length) {
            System.out.println("Index out of bounds for midDevelopers array.");
            return;
        }
        if (midDevelopers[index] != null) {
            System.out.println("MidDeveloper at index " + index + " already exists.");
        } else {
            midDevelopers[index] = midDeveloper;
            System.out.println("MidDeveloper added at index " + index);
        }
    }

    // SeniorDeveloper eklemek için overload edilmiş addEmployee metodu
    public void addEmployee(SeniorDeveloper seniorDeveloper, int index) {
        if (index >= seniorDevelopers.length) {
            System.out.println("Index out of bounds for seniorDevelopers array.");
            return;
        }
        if (seniorDevelopers[index] != null) {
            System.out.println("SeniorDeveloper at index " + index + " already exists.");
        } else {
            seniorDevelopers[index] = seniorDeveloper;
            System.out.println("SeniorDeveloper added at index " + index);
        }
    }
}
