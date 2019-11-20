/**
 * 
 */var i = 0;
 var  z = 0;
function timedCount() {
  i = i + 1;
  postMessage(i);
  setTimeout("timedCount()",500);
}

timedCount(); 