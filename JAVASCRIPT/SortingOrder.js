const number = [5,4,9,6,7,8,3,1,2,0];

for(let i=0;i<number.length;i++){
    for(let j=i+1;j<number.length;j++){
        if(number[i]<number[j]){
            let temp = number[i];
            number[i] = number[j];
            number[j] = temp
        }
    }
}

console.log("Descending order :"+number);