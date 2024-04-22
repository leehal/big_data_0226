let drink =[];
drink[0] = prompt("음료입력",'');
drink[1] = prompt("음료입력",'');
let mdr=drink[0];

let ham = [];
ham[0] = prompt("햄버거 입력",'');
ham[1] = prompt("햄버거 입력",'');
ham[2] = prompt("햄버거 입력",'');
let mham=ham[0];

for( let i of drink){
  if(i<mdr){
    mdr=i;
  };
};
for( let e of ham){
  if(e<mham){
    mham=e;
  };
};
console.log("햄버거 : "+mham+" , 음료 : "+mdr);
document.write("<h1>"+"햄버거 값은"+`${mham}원 이고 음료값은 ${mdr}을 선택합니다`+"</h1>")