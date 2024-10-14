let arr = ["1080px", "$100", "+200", "60kg", "6m", "-15"];
console.log(removeChar(arr));

function removeChar(arr) {
    return arr.map(item => {
        // 문자열의 앞뒤에서 특수 문자 제거 후 숫자로 변환
        return Number(item.replace(/[^0-9.-]+/g, '')); // 숫자와 '-'(음수)만 남김
    });
}