# TDT4250 - NTNUStudies

## Øving 1 - Model

### Department

This is the department at NTNU, for example _Department of Computer Science (IDI)_. The department contains `courses` and `programmes`.

### Programme

This is the study programme within a department, for example _"Datateknologi"_. The programme contains `specializations` and `semesters`.

### Course

This is the courses within a department, for example _"TDT4250"_. These courses can be either `mandatory` or `elective`. The courses also has a level `courseLevel` indicating whether the level of the course is _basic_, _medium_ or _high_.

### Specialization

This is the specialization within a programme, for example _"Programvareutvikling"_. `SpecializationChoicePoint` is the year which you have to choose this specific specialization. Within a specialization, you have `semesters` that are associated with this specialization. The `requiredSpecialization` field is for specializations that require a previous specialization. For example, _"programvareutvikling"_ requires _"programvaresystemer"_.

### Semester

This is the semester within a programme. A semester has `possibleCourses` which are courses that you are allowed/supposed to take that semester. It contains an enum for which type it is `semesterType` (_spring/fall_) and what year. A course can be either during fall/spring or both indicated by the `semesters` field.

### Not necessary for Assigment 1

These are the classes that were mentioned in the overall description of the domain, but were not specifically asked in assignment 1. Since I already did some logic for them, I will keep them.

#### Studyplan

This is the studyplan for a student. It contains what `programme` (ex: _datateknologi_) the student is enrolled in, which `specializations` the student has chosen (ex: [*"programvareutvikling", "programvaresystemer"*]) and which `chosenSemesters` the student has.

#### ChosenSemester

This is the semester the student has chosen to enroll in. It includes which `semester` it is (ex: _fall semester year 2019_) and what `courses` the student has chosen that specific semester. Spring semester 2020 for example, will contain other courses the student has chosen.

## Øving 1 - Model instances

The model instances are under `model/samples`.

Here there is one file: `DepartmentIDI`. It provides data for `department`, `courses`, `programme`, `specialization` and `semester`.

It also uses the enums `semesterType`, `courseLevel` and `courseType`.

## Øving 3 - Acceleo

The model is the same as the one from assignment 1, with some small adjustments and with a bigger .xmi sample.

### Running

Right click on the `generate.emtl` file and click `Run as->Run confic`. Use this run config:
![](/org.eclipse.acceleo.module.sample/docs/runconfig.png)

#### Proxy error

After spending 45min with Trætteberg, we found a solution to the error `The type of the first parameter of the main template named 'generateHtml' is a proxy.`. Not a very elegant one, but it works.

Go in the `navigator pane` in eclipse and find the generated file `generate.emtl` inside `bin->org->eclipse->acceleo->module->sample->main->generate.emtl`.

Use find-and-replace to replace `ntnustudies#` with `platform:/plugin/no.tdt4250.ntnustudies/model/ntnustudies.ecore#`.

![](/org.eclipse.acceleo.module.sample/docs/findreplace.png)

This must be done every time you make a change in the `generate.mtl` file.

### Output

The output is a `sample.html` file in the `output` folder. You can switch between the different specializations using the buttons, or show all.
