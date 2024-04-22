if (1==="1") console.log("비교 결과 같음");
else console.log("비교 결과 다름");

// 묵시적 형변환 : 숫자형 데이터와 무낮열 데이터를 연결 연산자로 처리하면 문자열로 형 변환
// 자바에서는 명시적 형변환을 하지 않으면 에러 발생
let num1 = 10+"10";
console.log(num1);

// 명시적 형변환 : 
let num2 = 10;
let num3 = "10";
console.log(num2+Number(num3));


