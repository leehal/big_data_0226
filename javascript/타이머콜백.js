function buy_tobe(item, price, quantity, callback) {
  console.log(item + " 상품을 " + quantity + "개 골라서 점원에게 주었습니다.");
  setTimeout(function () {
      console.log("계산이 필요합니다.");
      var total = price * quantity;
      callback(total);
  }, 2000);
}
function pay(n) {
  console.log("지불 할 금액은 : " + n + "입니다.");
}

// buy_tobe("'밤고구마'", 1000, 5, pay);

let button = document.querySelector("#myButton");
button.addEventListener("click", () => {
  console.log("전송 버튼이 눌러졌습니다.");
  console.log("내가 쓴 그링 전송 되었습니다");
});