// 클로저란? 함수가 해당 함수의 스코프 외부에 있는 변수에 접근할 수 있는 매커니즘
function counter() {
  let count = 0;
  return{
    increment: function() {
      count++;
      console.log(count);
    },
    decrement: function(){
      count--;
      console.log(count);
    }
  }
};
const myCounter = counter();
myCounter.increment();
myCounter.increment();
myCounter.increment();
myCounter.decrement();