// 표준 내장 객체란? 자바스크립트에서 개발의 펴의를 위햐 미리 제공하는 API

// 문자열을 다루는 String 객체
const pw = "1234567";
if(pw.length < 8) console.log("비밀번호는 최소 8자리 이상이어야 합니다.");

// 특정 문자열 포함여부 확인
// includes() : 포함되어 있으면 true 반환
const email = "test@naver.com";
if(email.includes("@") == false) console.log("올바른 이메일 형식이 아닙니다.");
if(!email.includes("@")) console.log("올바른 이메일 형식이 아닙니다."); // 위와 같은 문장
// indexOf() : 대상 문자열과 일치하는 첫 번쨰 문자의 인덱스를 반환
if(email.indexOf("@") == -1) console.log("올바른 이메일 형식이 아닙니다.");
console.log(email.indexOf("@")); //4가 나옴 어딨는지 찾아줌/ 없으면 -1(초기값)
// slice() : 시작위치와 종료 위치를 주면 해당 문자열을 잘라서 반환
let str = "Apple, Banana, Kiwi";
let resp = str.slice(7,13); // 인덱스는 0부터 시작하고 종료 위치는 미만 개념이 있음
console.log(resp);
// substring() : slice()함수와 동일하며, 단 매개변수에 음수를 허용하지 않음
let resp1 = str.substring(7); // 매개변수를 하나만 전달하면 시작 인덱스부터 끝까지
console.log(resp1);
// replace() : 문자열 내의 특정 문자열을 지정한 문자열로 바꾸는 함수
let str1 = "지구오락실, 이영지, 안유진, 미미, 이은지";
let resp2 = str1.replace("이은지","나영석");
console.log(resp2);
// replaceAll() : 대상 문자열 내의 모든 문자열을 지정한 문자열로 바꾸는 함수
let resp3 = str1.replaceAll("이", "김");
console.log(resp3);
// concat() : 두 개 이상의 문자열을 하나의 문자열로 합치는 함수
let text1 = "hello";
let text2 = "World";
let text3 = text1.concat(" ", text2);
console.log(text3);

let text4 = "Hello";
text4 += " " + "World";
console.log(text4);

// Number 객체 : 숫자와 관련된 작업을 할 때 사용되는 메소드
console.log(Number.parseFloat("12"));
console.log(Number.parseFloat("12.34"));
console.log(Number.parseFloat("12.34곰돌이사육사"));
console.log(Number.parseInt("곰돌이사육사12.34"));