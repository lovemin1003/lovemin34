/**
 * 
 */
function setclock()
{
var now = new Date();
document.getElementById('clock').innerHTML=now;
setTimeout('setclock()',1000);
}