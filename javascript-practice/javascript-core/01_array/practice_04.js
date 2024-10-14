function Student(firstName, lastName, score) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.score = score;
}

const studentList = [
    new Student('길동', '홍', 60),
    new Student('보고', '장', 70),
    new Student('관순', '유', 80)
];

sortFromScore(studentList);
console.log(studentList);
console.log(makeFullName(studentList));

function sortFromScore(arr) {
    studentList.sort((a, b) => b.score - a.score);

}

function makeFullName(arr) {
    return arr.map(student => {
        return {
            name: `${student.lastName}${student.firstName}`,
            score: student.score // 점수도 포함
        }
    })
}