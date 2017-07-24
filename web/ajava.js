/**
 * Created by vankayab on 7/20/2017.
 */
function sss() {
    var in1=document.forms["mform"]["input1"].value;
    var in2=document.forms["mform"]["input2"].value;
    var in3=document.forms["mform"]["input3"].value;
    var in4=document.forms["mform"]["input4"].value;
    var in5=document.forms["mform"]["input5"].value;
    if(in1.length==0){alert("please enter a valid username");in1.forms;}
    if(in2.length<6){in2.forms.error("password lenght should be greater than six characters");in2.forms.focus();}
    if(!in2.isEqual(in3)){in3.error("passwords does not match");in3.focus();}
    if(in4.length<10 || isNaN(in4)){in4.error("please enter a valid mobile number");in4.focus();}
    var atpos = in5.indexOf("@");
    var dotpos = in5.lastIndexOf(".");
    if (atpos<1 || dotpos<atpos+2 || dotpos+2>=in5.length) {
        in5.error("Not a valid e-mail address");
        in5.focus();}
}/**
 * Created by vankayab on 7/22/2017.
 */
