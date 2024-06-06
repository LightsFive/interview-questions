/*
package com;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentsController {

    private final StudentsService studentsService;

    @PostMapping("/results")
    public StudentResults createStudentResults(@RequestBody StudentResultsRequest request) {



    }

    @GetMapping("/{id}/exams/{examId}/rank")
    public Integer getStudentRank(@PathVariable int id) {


    }

    class StudentService {

        private final StudentRepository studentRepository;

        public int getStudentRank(int studentId, int examId) {

            int rank = student.getStudentExams()
                    .stream()
                    .filter(studentExam -> examId == studentExam.getExamId())
                    .map(StudentExam::getRank)
                    .findFirst();
        }
    }

    class Student {

        @Id
        private Integer id;

        private String name;

        private StudentExam studentExam;
    }
}
*/
