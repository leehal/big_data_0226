// 스코프 : 변수나 함수가 영향을 미치는 범위
// 전역 스코프 : 함수 외부에 선언되어서 파일 전체에 영향을 줌

// let a = 10; // 전역 스코프 : 함수 외부에 선언된 변수는 함수 내부에도 영향을 끼침
// function sum(x){
//   console.log(`함수 내부 :${a+=x}`);
// }
// sum(100);
// console.log(`함수 외부 : ${a}`);

// 지역 스코프
// function sum() {
//   let a = 10;
//   console.log(`함수 내부 : ${a}`);
// }
// sum();
// console.log(`함수 외부 : ${a}`); // 이거 안됨 오류남

// 블록 스코프 : 자바스크립트는 원래 함수 스코프를 따르는 언어 였지만,
//              ES6 에서 블록스코프를 지원하는 let, const가 추가됨
// 함수 스코프는 함수 이름을 통해 해당 변수의 범위가 결정되고
// 블록 스코프는 {중괄호}를 통해 변수의 범위가 결정된다.
// let a = 10;
// {
//     let b = 20;
//     console.log(`코드 블록 내부 a : ${a}`);
//     console.log(`코드 블록 내부 b : ${b}`);
// }
// console.log(`코드 블록 외부 a : ${a}`);
// console.log(`코드 블록 외부 b : ${b}`);

// 참조 우선 순위
// let a = 10;
// const b = 20;
// function sum20() {
//   let a = 50;
//   const b = 70;
//   console.log(`함수내부 a : ${a}`);
//   console.log(`함수내부 b : ${b}`);
// }
// console.log(`함수외부 a : ${a}`);
// console.log(`함수외부 b : ${b}`);

// 즉시 실행 함수 : 함수를 정의하자마자 바로 실행하는 함수
// (function() {}) : 즉시 실행함수 형식
(function () {
  width = 500;
  height = 300;
  console.log(`너비 : ${width}, 높이 : ${height}`);
  init();
})();

function init(){
  console.log("프로그램 실행을 위해 초기화 작업 수행중...");
}