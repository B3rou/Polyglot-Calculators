let inputBox = document.querySelector("#inputBox");
let btns = document.querySelectorAll(".button");

let string = " ";
let allowedkeys = "0123456789+-*/.";

btns.forEach((element) => {
  element.addEventListener("click", (dets) => {
    if (dets.target.textContent == "=") {
      string = String(eval(string));
      inputBox.value = string;
    } else if (dets.target.textContent == "AC") {
      string = "";
      inputBox.value = string;
    } else if (dets.target.textContent == "DEL") {
      string = string.substring(0, string.length - 1);
      inputBox.value = string;
    } else {
      string += dets.target.textContent;
      inputBox.value = string;
      console.log(dets);
    }
  });
});

document.addEventListener("keydown", (dets) => {
  if (dets.key == "Enter") {
    string = String(eval(string));
    inputBox.value = string;
  } else if (dets.key == "Escape") {
    string = "";
    inputBox.value = string;
  } else if (dets.key == "Backspace") {
    string = string.substring(0, string.length - 1);
    inputBox.value = string;
  } else if (allowedkeys.includes(dets.key)) {
    string += dets.key;
    inputBox.value = string;
    console.log(dets);
  }
});
