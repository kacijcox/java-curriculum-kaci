let message = "welcome to javascript";
console.log(message.length);

console.log(message.charAt(20));

message2 = message.toUpperCase();
message3 = message.toLowerCase()
console.log(message2, message3);

messageindex = message.indexOf("javascript");
console.log(messageindex);

messagesub = message.substring(11);
console.log(messagesub);

messagereplace = message.replace("javascript", "coding");
console.log(messagereplace);

let s1 = "elephant";
for(let i = 0; i < s1.length; i++) {
    console.log(`The character at index ${{i}} is ${s1.charAt(i)}`);
}