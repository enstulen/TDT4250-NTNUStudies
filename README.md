# TDT4250 - NTNUStudies

## Model

### Department

This is the department at NTNU, for example _Department of Computer Science (IDI)_. The department contains `courses` and `programmes`.

### Programme

This is the study programme within a department, for example _"Datateknologi"_. The programme contains `specializations` and `semesters`.

### Course

This is the courses within a department, for example _"TDT4250"_. These courses can be either `mandatory` or `elective`. The courses also has a level `courseLevel` indicating whether the level of the course is _basic_, _medium_ or _high_.

### Specialization

This is the specialization within a programme, for example _"Programvareutvikling"_. `SpecializationChoicePoint` is the year which you have to choose this specific specialization. Within a specialization, you have certain `courses` that are associated with this specialization. The `requiredSpecialization` field is for specializations that require a previous specialization. For example, _"programvareutvikling"_ requires _"programvaresystemer"_.

### Semester

This is the semester within a programme. A semester has `possibleCourses` which are courses that you are allowed/supposed to take that semester. It contains an enum for which type it is `semesterType` (_spring/fall_) and what year. A course can be either during fall/spring or both indicated by the `semesters` field.

### Not necessary for Assigment 1

These are the classes that were mentioned in the overall description of the domain, but were not specifically asked in assignment 1. Since I already did some logic for them, I will keep them.

#### Studyplan

This is the studyplan for a student. It contains what `programme` (ex: _datateknologi_) the student is enrolled in, which `specializations` the student has chosen (ex: [*"programvareutvikling", "programvaresystemer"*]) and which `chosenSemesters` the student has.

#### ChosenSemester

This is the semester the student has chosen to enroll in. It includes which `semester` it is (ex: _fall semester year 2019_) and what `courses` the student has chosen that specific semester. Spring semester 2020 for example, will contain other courses the student has chosen.

## Model instances

The model instances are under `model/samples`.

Here there are two files: `DepartmentIDI` and `ProgrammeDatateknologi`. They provide data for `department`, `courses`, `programme`, `specialization` and `semester`.

They also use the enums `semesterType`, `courseLevel` and `courseType`.
