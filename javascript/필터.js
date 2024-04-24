// filter() 함수는 배열에서 특정 조건을 만족하는 배열의 요소만 찾아서 새로운 배열을 반환
// 배열을 다룰 때 가장 많이 사용되는 함수  중 하나
const persons = [
  {
    name: "유재석",
    point: 78,
    city: "서울",
  },
  {
    name: "김종국",
    point: 92,
    city: "서울",
  },
  {
    name: "양세찬",
    point: 76,
    city: "제주",
  },
  {
    name: "하하",
    point: 81,
    city: "서울",
  },
];
const pass = persons.filter(person => person.point > 80);
console.log(pass);

const num = [1,2,3,4,5];
const squaredNum = num.map(e => {
  return(e * e);
});
console.log(squaredNum);