//A. Take a sentence as an input and reverse every word in that sentence. 
//a. Example - This is a sunny day > shiT si a ynnus yad. 

function reverseWords(senetense){
    let reverse = '';
    let word = '';
    let space = ' ';

    for(let i = 0;i<senetense.length;i++){
        if(senetense[i] !==space){
            word = senetense[i] + word;
        }
        else{
            reverse += word + space;
            word = '';
        }

        if(i === senetense.length - 1){
            reverse += word;
        }
    }
    return reverse;
}

const input = "Hi I am Shubham";
const reversed = reverseWords(input);
console.log(reversed);