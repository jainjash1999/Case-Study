<html>
<body>
<h2>Cowid-19</h2>


<FORM  action="total_cases_CountryWise" NAME="form1" METHOD="POST">
            <INPUT TYPE="HIDDEN" NAME="buttonName">
            <INPUT TYPE="BUTTON" VALUE="total_cases_CountryWise" ONCLICK="button1()">
            </FORM>
            <FORM  action="total_cases" NAME="form2" METHOD="POST">
            <INPUT TYPE="HIDDEN" NAME="buttonName">
            <INPUT TYPE="BUTTON" VALUE="total_cases" ONCLICK="button2()">
            </Form>
            <FORM  action="newCases_countryWise" NAME="form3" METHOD="POST">
            <INPUT TYPE="HIDDEN" NAME="buttonName">
            <INPUT TYPE="BUTTON" VALUE="newCases_countryWise" ONCLICK="button3()">
            </form>
            <FORM  action="total_newCases" NAME="form4" METHOD="POST">
            <INPUT TYPE="HIDDEN" NAME="buttonName">
            <INPUT TYPE="BUTTON" VALUE="total_newCases" ONCLICK="button4()"></form>
            
            <FORM  action="total_deaths_CountryWise" NAME="form5" METHOD="POST">
            <INPUT TYPE="HIDDEN" NAME="buttonName">
            <INPUT TYPE="BUTTON" VALUE="total_deaths_CountryWise" ONCLICK="button5()"></form>
            
            <FORM  action="new_deaths_CountryWise" NAME="form6" METHOD="POST">
            <INPUT TYPE="HIDDEN" NAME="buttonName">
            <INPUT TYPE="BUTTON" VALUE="new_deaths_CountryWise" ONCLICK="button6()"></form>
            
            <FORM  action="new_tests_CountryWise" NAME="form7" METHOD="POST">
            <INPUT TYPE="HIDDEN" NAME="buttonName">
            <INPUT TYPE="BUTTON" VALUE="new_tests_CountryWise" ONCLICK="button7()"></form>
            
            <FORM  action="total_tests_CountryWise" NAME="form8" METHOD="POST">
            <INPUT TYPE="HIDDEN" NAME="buttonName">
            <INPUT TYPE="BUTTON" VALUE="total_tests_CountryWise" ONCLICK="button8()">
            
        </FORM>

        <SCRIPT LANGUAGE="JavaScript">
          
            function button1()
            {
                document.form1.buttonName.value = "total_cases_CountryWise"
                form1.submit()
            }    
            function button2()
            {
                document.form2.buttonName.value = "total_cases"
                form2.submit()
            }   
            function button3()
            {
                document.form3.buttonName.value = "newCases_countryWise"
                form3.submit()
            } 
            function button4()
            {
                document.form4.buttonName.value = "total_newCases"
                form4.submit()
            } 
            function button5()
            {
                document.form5.buttonName.value = "total_deaths_CountryWise()"
                form5.submit()
            } 
            function button6()
            {
                document.form6.buttonName.value = "new_deaths_CountryWise"
                form6.submit()
            } 
            function button7()
            {
                document.form7.buttonName.value = "new_tests_CountryWise"
                form7.submit()
            } 
            function button8()
            {
                document.form8.buttonName.value = "total_tests_CountryWise"
                form8.submit()
            } 
            
        </SCRIPT>

</body>
</html>
