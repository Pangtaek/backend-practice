const list = ['기러기', '토마토', '스위스', '인도인', '별똥별', '우별림'];

list.forEach(item => console.log(palindrom(item)));

function palindrom(str) {
    const reversedStr = str.split('').reverse().join('');
    return str === reversedStr;
}