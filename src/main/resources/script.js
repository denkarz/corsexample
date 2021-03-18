document.getElementById ("get").addEventListener("click", function() {
    getRequest();
} , false);
document.getElementById ("patch").addEventListener("click", function() {
    patchRequest();
} , false);
document.getElementById ("post").addEventListener("click", function() {
    postRequest();
} , false);
document.getElementById ("put").addEventListener("click", function() {
    putRequest();
} , false);
function getRequest () {
    axios.get()
    axios.get('http://localhost:8080/cors/get/')
        .then(response => {
            console.log(response);
        })
        .catch(error => console.error(error));
};

function patchRequest () {
    axios.patch('http://localhost:8080/cors/patch/',{"method":"Patch", "status":"OK"})
        .then(response => {
            console.log(response);
        })
        .catch(error => console.error(error));
};

function postRequest () {
    axios.post('http://localhost:8080/cors/post/',{})
        .then(response => {
            console.log(response);
        })
        .catch(error => console.error(error));
};

function putRequest () {
    axios.put('http://localhost:8080/cors/put/',{})
        .then(response => {
            console.log(response);
        })
        .catch(error => console.error(error));
};