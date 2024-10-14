console.log(getWeekDay(2022, 6, 21));       // 2022년 6월 21일
console.log(getWeekDay(2022, 12, 12));      // 2022년 12월 12일

function getWeekDay(year, month, date) {
    // 월(month)은 0부터 시작하므로 1을 빼줍니다.
    const dateObj = new Date(year, month - 1, date);

    // 요일을 숫자로 가져옴 (0: 일요일, 1: 월요일, ..., 6: 토요일)
    const weekDays = ['일', '월', '화', '수', '목', '금', '토'];
    const dayIndex = dateObj.getDay();

    // 해당 요일 반환
    return weekDays[dayIndex];
}