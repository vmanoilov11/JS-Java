function solve(month, year) {
    const days = (month, year) => {return new Date(year, month, 0).getDate();
    }
  
    console.log(days(month, year));
}
