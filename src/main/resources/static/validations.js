//Verificamos que no haya ningun email repetido con editar
function checkDuplicateEmails() {
        const rows = document.querySelectorAll("#employeesTable tbody tr");
    const emails = new Set(); // Usamos un conjunto para almacenar correos electrónicos únicos
    let duplicateFound = false;

    // Iteramos sobre cada fila de la tabla
    rows.forEach(row => {
        const emailCell = row.querySelector("td:nth-child(5)").textContent.trim().toLowerCase();

        // Verificamos si el correo electrónico ya está en el conjunto
        if (emails.has(emailCell)) {
            console.log("Correo duplicado encontrado:", emailCell);
            duplicateFound = true;
            return; // Salimos del bucle forEach si se encuentra un duplicado
        }

        // Agregamos el correo electrónico al conjunto
        emails.add(emailCell);
    });

    return duplicateFound;
}

// Verificamos que no haya ningún número de teléfono repetido con editar
function checkDuplicatePhones() {
    const rows = document.querySelectorAll("#employeesTable tbody tr");
    const phones = new Set(); // Usamos un conjunto para almacenar números de teléfono únicos
    let duplicateFound = false;

    // Iteramos sobre cada fila de la tabla
    rows.forEach(row => {
        const phoneCell = row.querySelector("td:nth-child(6)").textContent.trim();

        // Verificamos si el número de teléfono ya está en el conjunto
        if (phones.has(phoneCell)) {
            console.log("Número de teléfono duplicado encontrado:", phoneCell);
            duplicateFound = true;
            return; // Salimos del bucle forEach si se encuentra un duplicado
        }

        // Agregamos el número de teléfono al conjunto
        phones.add(phoneCell);
    });

    return duplicateFound;
}

// Función para validar el nombre, apellido, rol y departamento
function isValidText(text) {
    // Verificar si el texto contiene solo letras del alfabeto latino, incluidas aquellas con acentos
    return /^[A-Za-záéíóúÁÉÍÓÚüÜñÑ\s]+$/.test(text);
}

// Función para validar la longitud del nombre (máximo de 25 caracteres)
function isValidNameLength(name) {
    return /^[A-Za-záéíóúÁÉÍÓÚüÜñÑ\s]{1,25}$/.test(name);
}

// Función para validar la longitud del apellido (máximo de 25 caracteres)
function isValidSurnameLength(surname) {
    return /^[A-Za-záéíóúÁÉÍÓÚüÜñÑ\s]{1,25}$/.test(surname);
}

// Función para validar que el nombre no se repita más de 15 veces
function isValidNameRepetition(name) {
    const rows = document.querySelectorAll("#employeesTable tbody tr");
    let nameCount = 0;

    rows.forEach(row => {
        const nameCell = row.querySelector("td:nth-child(2)").textContent.trim();
        if (nameCell.toLowerCase() === name.toLowerCase()) {
            nameCount++;
        }
    });

    return nameCount < 16;
}

// Función para validar que el apellido no se repita más de 5 veces
function isValidSurnameRepetition(surname) {
    const rows = document.querySelectorAll("#employeesTable tbody tr");
    let surnameCount = 0;

    rows.forEach(row => {
        const surnameCell = row.querySelector("td:nth-child(3)").textContent.trim();
        if (surnameCell.toLowerCase() === surname.toLowerCase()) {
            surnameCount++;
        }
    });

    return surnameCount < 6;
}
// Función para validar el rol (límite de 30 caracteres)
function isValidRole(role) {
    return /^[A-Za-záéíóúÁÉÍÓÚüÜñÑ\s]{1,30}$/.test(role);
}
// Función para validar el departamento (límite de 30 caracteres)
function isValidDepartment(department) {
    return /^[A-Za-záéíóúÁÉÍÓÚüÜñÑ\s]{1,30}$/.test(department);
}


// Función para validar el correo electrónico
function isValidEmail(email) {
    return /^\S+@\S+\.\S{2,}$/.test(email) && email.length <= 100;
}

// Función para validar el número de teléfono
// Verificar si el número de teléfono contiene solo números y espacios en blanco
function isValidPhone(phone) {
    return /^[\d\s]{1,15}$/.test(phone);
}

// Función para validar la edad
function isValidAge(age) {
    // Verificar si la cadena de edad contiene solo números y no tiene espacios en blanco
    if (!/^\d+$/.test(age) || /\s/.test(age)) {
        return false; // Retorna false si la cadena no es un número o contiene espacios en blanco
    }
    // Verificar si la edad es un número entero y mayor que cero
    return Number(age) > 0 && Number(age) < 105;
}

// Función para validar el salario
function isValidSalary(salary) {
    // Verificar si el salario es un número válido y mayor que cero
    return !isNaN(salary) && salary > 0 && salary < 100000;
}

// Función para validar el estado civil sin espacios en blanco
function isValidMaritalStatus(maritalStatus) {
    // Verificar si el estado marital contiene solo letras y es 'single' o 'married'
    return /^[A-Za-z]+$/.test(maritalStatus) && (maritalStatus === "single" || maritalStatus === "married");
}









