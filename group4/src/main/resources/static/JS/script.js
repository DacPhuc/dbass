var myIndex = 0;
slideshow();
function slideshow() {
    var i;
    var x = document.getElementsByClassName("myslide");
    for (i = 0; i < x.length; i++) {
       x[i].style.display = "none";  
    }
    myIndex++;
    if (myIndex > x.length) {myIndex = 1}    
    x[myIndex-1].style.display = "block";  
    setTimeout(slideshow, 2000);
}
function a(){
    var a=document.querySelector('#menu1');
    var b=document.querySelector('#menu2');
    var c=document.querySelector('#menu3');
    a.style.display='block';
    a.style.display='flex';
    b.style.display='none';
    c.style.display='none';
}
function b(){
    var a=document.querySelector('#menu1');
    var b=document.querySelector('#menu2');
    var c=document.querySelector('#menu3');
    a.style.display='none';
    b.style.display='block';
    b.style.display='flex';
    c.style.display='none';
}
function c(){
    var a=document.querySelector('#menu1');
    var b=document.querySelector('#menu2');
    var c=document.querySelector('#menu3');
    a.style.display='none';
    b.style.display='none';
    c.style.display='block';
    c.style.display='flex';
}