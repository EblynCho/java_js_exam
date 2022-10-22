let rides = prompt("제한 무게, 탑승인원수, 몸무게");
console.log("입력 >> " + rides);
let arr = rides.split(" ").map(Number);
let limit = arr.shift();
// console.log("제한 무게" + limit);
let num = arr.shift();
// console.log("인원" + num);
// console.log(arr);


    for (let i = 0; i < arr.length; i++) {
        limit = limit - arr[i];
        if ((limit - arr[i]) < 0) {
            console.log("탑승 인원 >> " + (i + 1));
            break;
        }
    }
