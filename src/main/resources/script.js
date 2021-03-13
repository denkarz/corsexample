document.getElementById ("get").addEventListener("click", function() {
    getRequest();
} , false);
document.getElementById ("patch").addEventListener("click", function() {
    patchRequest();
} , false);
function getRequest () {
    axios.get('localhost:8080/cors/get/')
        .then(response => {
            console.log(response);
        })
        .catch(error => console.error(error));
};

function patchRequest () {
    axios.patch('localhost:8080/cors/patch/',{"method":"Patch", "status":"OK"})
        .then(response => {
            console.log(response);
        })
        .catch(error => console.error(error));
};