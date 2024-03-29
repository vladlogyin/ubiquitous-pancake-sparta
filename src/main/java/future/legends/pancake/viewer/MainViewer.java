package future.legends.pancake.viewer;

import future.legends.pancake.logger.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainViewer {

    static Scanner scanner = new Scanner(System.in);

    public int getSimulationDuration(){

        boolean validInput = false;
        int months = 0;

        while (!validInput){

            System.out.println("How many months would you like the simulation to run for?");

            try{
                months = scanner.nextInt();
                if (months > 0){
                    validInput = true;
                }
                else{
                    throw new InputMismatchException();
                }
            }
            catch(InputMismatchException e){
                System.out.println("\nInvalid Input: Please enter a positive integer that is greater than 0\n");
                scanner.nextLine();
            }
        }

        Logger.info("User selected a " + months + " month simulation");
        return months;

    }

    /**
     *
     * @return returns true if every month
     */
    public boolean getSimulationReportEveryMonth(){

        boolean validInput = false;
        int reportFrequency = 0;

        while (!validInput){

            System.out.println("When would you like to receive simulation reports? Select a number: ");
            System.out.println("1. End of simulation");
            System.out.println("2. End of every month");

            try{
                reportFrequency = scanner.nextInt();
                if (reportFrequency == 1 || reportFrequency == 2){
                    validInput = true;
                }
                else{
                    throw new InputMismatchException();
                }
            }
            catch(InputMismatchException e){
                System.out.println("\nInvalid input: Please enter 1 or 2\n");
                scanner.nextLine();
            }

        }

        return reportFrequency==2;

    }

    public void displaySimulationReport(String simulationReport){
        System.out.println(simulationReport);
        Logger.info("Displayed simulation report");
    }

}
