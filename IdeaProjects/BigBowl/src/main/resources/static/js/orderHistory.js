function deleteInfo(id){
    if(window.confirm('Are you sure to delete it?')){

        fetch('/api/order/' + id, {
            method: 'DELETE'
        }).then(res => {
            res.json().then(data => {
            alert(data.message);
        location.reload();
    })
    }
    );
    }
}



function cancel(id){
    if(window.confirm('Are you sure to cancel it?')){

        fetch('/api/order/' + id, {
            method: 'PUT'
        }).then(res => {
            res.json().then(data => {
            alert(data.message);
        location.reload();
    })
    }
    );
    }
}


function readOrder(id){
    window.location.href = '/order/' + id;


}