

// 데이터타입 : 자바스크립트는 동적 타입의 언어이지만 내부적으로 데이터 타입이 존재
// 데이터타입은 원시 타입(할당받은 공간에 값이 대입)과 객체 타입이 존재
// 자바스크립트에서 문자열을 표시하기 위해서 "", '', ``를 사용할 수 있음
// ``(백틱)은 ES6에서 추가된 문법이고 '${변수 또는 코드}'를 포함 할 수 있음
let str = "100\n" + "안녕하세요" +'자바스크립트를 배워 봅시다'+` 리액트도 함`;
console.log(typeof str);
console.log(str);

let x = 123;
console.log(typeof(x.toString()));

// 논리형 : 참 또는 거짓으로 구분
let age = 21;
let isAdult = (age>18) ? true : false;
if(isAdult) console.log("성인");
else console.log("미자");

// undefined : 변수나 상수를
let empty; //자바스크립트는 값이 대입 될 떄 형이 결정나고 값이 대입되지 않으면 undefined
console.log(empty);

// 객체 : 자바스트립트는 기본 자료형을 제외하고 모든 자료형이 객체 임.
// 배열
let score = [80,99,100,95];
console.log(score);
console.log(score[2]);
let array2 = ["아이브",'안유진',20,true,[100,99,80]];
console.log(array2);
console.log(array2[1][1]);
console.log(array2[4][2]);

// 객체 리터럴 (자바의 Map과 조금 유사)
let score2 = {
  kor: 80,
  eng: 90,
  mat: 56,
  scn:90, // 다음 값이 없어도 , 을 넣어줘야 함.
};
console.log(score2.mat);

// typeof : 데이터 형을 확인하기 위해 사용
let name = "장원영";
console.log(typeof name);

// tostring() : 문자열로 변환하는 메소드
let fruit = ["포도","사과","바나나"];
console.log(fruit.toString());

// 비교연산자
console.log(1=='');















