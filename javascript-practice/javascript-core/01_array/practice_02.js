function filterRange(arr, a, b) {
    // 코드 작성
    arr.forEach((item, index) => {
        if (item < a || item > b) {
            arr.splice(index, 1);
        }
    });
}

const arr = [5, 3, 8, 1, 10, 4];

filterRange(arr, 1, 5);

console.log(arr);
