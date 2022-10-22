while (true) {
    let input = prompt("입력 ");
    let change = input.replace(/q/g, 'e');

    console.log("입력 >> " + input);
    console.log("출력 >> " + change);
}