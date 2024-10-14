console.log(getSecondsToday() + "초나 흘렀습니다. 시간을 소중히 씁시다^^");
console.log(getSecondsToTomorrow() + "초 밖에 안 남았습니다. 다시는 오지 않는 오늘입니다^^");

function getSecondsToday() {
    const now = new Date(); // 현재 시간
    const startOfDay = new Date(now.getFullYear(), now.getMonth(), now.getDate()); // 오늘 00:00:00

    // 오늘 흐른 시간(밀리초)
    const elapsedMilliseconds = now - startOfDay;

    // 밀리초를 초로 변환
    const elapsedSeconds = Math.floor(elapsedMilliseconds / 1000);

    return elapsedSeconds;
}

function getSecondsToTomorrow() {
    const now = new Date(); // 현재 시간
    const tomorrow = new Date(now.getFullYear(), now.getMonth(), now.getDate() + 1); // 내일 00:00:00

    // 내일 자정까지의 밀리초 계산
    const elapsedMilliseconds = tomorrow - now;

    // 밀리초를 초로 변환
    const elapsedSeconds = Math.floor(elapsedMilliseconds / 1000);

    return elapsedSeconds;
}
