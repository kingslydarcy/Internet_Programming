console.log(/^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$ /.test("usernaem@domain.com"));

function validate() {

    if (isempty("username") && isempty("userpass") && isempty("usermail") && isempty("userphno") && radio()) {

        if (/^[a-zA-Z]+$/.test(document.getElementById("username").value)) {
            if (/^\d{10}$/.test(document.getElementById("userphno").value)) {
                const mail = document.getElementById("usermail");
                const regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                    + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
                // if (/^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$ /.test(document.getElementById("usermail").value)) {
                if (mail.value.match(regexPattern)) {
                    if (/^\d{6}$/.test(document.getElementById("usercode").value)) {
                        confirm("Login Successfull");
                    }
                    else {
                        //else part of zip code
                        alert("invalid zipcode");
                    }

                }
                else {
                    //else block of email
                    alert("invalid mail");
                }
            }
            else {
                //else block of phone number
                alert("invalid phone number");
            }
        }
        else {
            //else block of name
            alert("invalid user name");
        }
    
    }
    else{
        //else block  of empty
        alert("fill the form details");
    }
}

function isempty(id) {
    const ele = document.getElementById(id).value;
    if (ele == null || ele == "") {
        return false;
    }
    else {
        return true;
    }
}

// function validateradio(){
//     const radioButtons=document.querySelectorAll('input[name="flexRadioDefault"]');
//     for (const radioButton of radioButtons) {
//         if (radioButton.checked) {
//             const test = radioButton.value;
//             break;
//         }
//         if(test){
//             alert("checked");
//         }
//     }
// }
function radio() {
    if (document.getElementById("usergen1").checked || document.getElementById("usergen2").checked) {
        return true;
    }
    else {
        return false;
    }
}
