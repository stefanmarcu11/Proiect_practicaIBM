let btresetClear=document.getElementById('btreset');
let inputs=document.querySelectorAll('input');

btresetClear.addEventListener('click',()=>{
   inputs.forEach(input=>input.value='');
})