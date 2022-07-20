# Sparta Trainees Simulator Project

## Table of Contents
* [Project Description](#project-description)
* [Technology](#technology)
* [Project Phases](#project-phases)
* [Setup](#setup)
* [Usage](#usage)
* [Features](#features)
* [Testing](#testing)
* [Contact](#contact)

## Project Description

A simulator which will help track the number of people currently training at Sparta training centres. This project is part of our training at [Sparta Global](https://www.spartaglobal.com/).

## Technology
- __IntelliJ IDEA__ [2022.1.3](https://www.jetbrains.com/idea/download/#section=windows)
- __JDK__ [18.0.2](https://jdk.java.net/18/)
- __Apache Maven__ [3.8.1](https://maven.apache.org/download.cgi)
- __JUnit Jupiter__ [5.8.2](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api/5.8.2)
- __Log4J__ [2.17.2](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-core/2.17.2)


## Project Phases

### Phase 1
- The tracker needs to be able to track time in a consistent way.
- The program starts by asking how long the simulation will run for.
- Every month, a random number of trainees are generated, wanting to be trained (50 - 100).
- Every 2 months, Sparta Global opens training centres; they open instantly and can take trainees every month.
- A centre can train a max of 100 trainees and takes a random number of trainees every month (0 - 50 trainees up to their capacity).
- If a centre is full, trainees can be moved to any other centre which is not full.
- If all centres are full, the trainees go onto a waiting list; this list must be served first before new trainees are taken.
- At the end of the simulation, output should show:
  - Number of open centres
  - Number of full centres
  - Number of trainees currently training
  - Number of trainees on the waiting list

### Phase 2
- Sparta will now check centres each month.
  - If a centre has fewer than 25 trainees, it will close.
  - The trainees will be randomly moved to another suitable centre.
- The simulation should now offer the choice of summary data at the end of the simulation or a running output updated each month.
- Trainees will now have a course type (Java, C#, Data, DevOps or Business); a trainee will be randomly assigned a course when they are created and this will never change.
- Sparta now has 3 different types of centre - when a new centre can be opened, one of the following will be randomly chosen:
  - Training Hub: can train a maximum of 100 trainees, but 3 (randomly 1-3) can be opened at a time each month.
  - Bootcamp: can train a maximum of 500 trainees, but can remain open for 3 months if there are fewer than 25 trainees in attendance. If a Bootcamp has 3 consecutive months of low attendance, it will close. For the lifetime of the simulation, only 2 Bootcamps can exist at a time.
  - Tech Centre: Can train 200 trainees but only teaches one course per centre. This is chosen randomly when a Tech Centre is opened.
- The simulation should report on the following:
  - Number of open centres (breakdown for each type)
  - Number of closed centres (breakdown for each type)
  - Number of full centres (breakdown for each type)
  - Number of trainees currently training (breakdown for each type)
  - Number of trainees on the waiting list (breakdown for each type)

### Phase 3
- If a trainee has been in training for 3 months, they are moved to a bench state.
- Clients will begin to be randomly created after 1 year of the simulation.
- A client will have a requirement when they are created (for example, a need for 27 Java trainees). The requirement can be any value greater than or equal to 15.
- A client will take a random number of trainees from the bench each month (1 - full requirement) until their requirement is met.
- A client will only take one type of trainee (Java, C#, Data, DevOps or Business).
- If a client does not collect enough trainees from the bench within a year, they will leave unhappy.
- If a client does collect enough trainees from the bench within a year, they will leave happy and return the next year with the same requirement.

## Setup

Clone the [repository](https://github.com/vladlogyin/ubiquitous-pancake-sparta.git)
```sh
git clone https://github.com/vladlogyin/ubiquitous-pancake-sparta.git
```

## Usage

## Features

## Testing

## Contact
Team members:
- [Yanaki Kolarov](https://github.com/ykolarov)
- [Bart Perczynski](https://github.com/Baaartosz)
- [Michael Matson](https://github.com/M-Matson)
- [Vlad Logyin](https://github.com/vladlogyin)
- [Dogukhan Karapinar](https://github.com/DogukhanK)
- [Omar Tehami](https://github.com/OTDZ)