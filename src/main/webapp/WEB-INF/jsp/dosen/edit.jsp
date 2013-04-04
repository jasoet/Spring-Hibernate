<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<div class="content">
    <c:url value="/dosen" var="dosen_url"/>

    <form:form action="${dosen_url}" method="PUT" modelAttribute="dosen" id="dosenForm">
        <form:hidden path="id" id="id"/>
        <div class="blocksection">
            <div class="blockcontent">
                <h3>Edit Dosen </h3>
                <dl class="form-text">
                    <dt>
                        <label for="niy">NIP :</label>
                    </dt>
                    <dd>

                        <form:input path="niy" id="niy" disabled="true"/>

                        <form:errors delimiter="&lt;p/&gt;" cssClass="boxinfo error"
                                     path="niy"/>
                        <p class="description">Required.</p>
                    </dd>
                </dl>
                <dl class="form-text">
                    <dt>
                        <label for="nama">Nama :</label>
                    </dt>
                    <dd>

                        <form:input path="nama" id="nama"/>

                        <form:errors delimiter="&lt;p/&gt;" cssClass="boxinfo error"
                                     path="nama"/>
                        <p class="description">Required.</p>
                    </dd>
                </dl>
            </div>
        </div>
        <div class="form-button">
            <div class="buttonWrapper">
                <a href="<c:url value='/dosen'/>" class="back">Back</a>
            </div>
            <input type="submit" value="Save" name="submit_1" id="submit_1"/>
            <input class="grey" type="reset" value="Clear" name="reset_1" id="reset_1"/>
        </div>
    </form:form>
</div>