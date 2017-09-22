function addItem1(){
    window.location.href = '/mork1';


}

function addItem2(){
    window.location.href = '/mork2';


}

function addItem3(){
    window.location.href = '/mork3';


}


function checkout1() {


    var qty = document.querySelector('#add-del1').value;

    var qauntity1 = parseInt(qty);



    ordernew ={
        itemId: parseInt('1'),
     quantity: qauntity1

    };


    fetch('/api/order', {
        method: 'POST',
        headers: {
            'Accept': 'application/json, text/plain, */*',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(ordernew)
    }).then(res => {
        res.json().then(data => {
        window.location.href = '/orderHistory';
})
});




}






function checkout2() {


    var qty = document.querySelector('#add-del2').value;

    var qauntity2 = parseInt(qty);



    ordernew ={
        itemId: parseInt('2'),
        quantity: qauntity2

    };


    fetch('/api/order', {
        method: 'POST',
        headers: {
            'Accept': 'application/json, text/plain, */*',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(ordernew)
    }).then(res => {
        res.json().then(data => {
        window.location.href = '/orderHistory';
})
});




}



function checkout3() {


    var qty = document.querySelector('#add-del3').value;

    var qauntity3 = parseInt(qty);



    ordernew ={
        itemId: parseInt('3'),
        quantity: qauntity3

    };


    fetch('/api/order', {
        method: 'POST',
        headers: {
            'Accept': 'application/json, text/plain, */*',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(ordernew)
    }).then(res => {
        res.json().then(data => {
        window.location.href = '/orderHistory';
})
});




}
