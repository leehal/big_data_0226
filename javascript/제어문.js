// 조건문 : if, switch, 3항 연산자가 있으며 자바와 동일
// 반복문 : while, do~ while, for, for in, for of 등이 있음 (자바와 유사)
let brands = ["애플", "구글", "페이스북", "아마존", "삼성전자"];
for(let i = 0; i < brands.length; i++){
  // console.log(brands[i]);
};
// for of : 자바의 향상된 for문과 유사
for (let e of brands){
  console.log(e);
};

// for in : 객체의 프로퍼티를 열거할 때 사용
let person = {
  name : "장원영",
  addr : "서울시 강남구",
  group : "아이브",
  age : 20,
};
for(let k in person){ // 키를 통해 값을 출력
  // console.log(person[k]);
};