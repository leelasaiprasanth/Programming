// function api() {
//   return new Promise((resolve, reject) => {
//     setTimeout(() => {
//       console.log("Weather Data.");
//       resolve(200);
//     }, 2000);
//   });
// }

// async function getWeatherData() {
//   await api(); //1stcall
//   await api(); //2ndCall
// }

// getWeatherData();

// let promise = new Promise((resolve, reject) => {
//   console.log("I am a promise");
// });

// async function hello() {
//   console.log("hello..");
// }

function getData(dataId, getNextData) {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      console.log("data", dataId);
      resolve("success");
      if (getNextData) {
        getNextData();
      }
    }, 3000);
  });
}

// //Aync-await
// async function getAllData() {
//   await getData(1);
//   await getData(2);
//   await getData(3);
// }
// getAllData();

//IIFE
(async () => {
  await getData(1);
  await getData(2);
  await getData(3);
})();

//Promise Chain
// let p1 = getData(1);
// p1.then((res) => {
//   console.log(res);
//   getData(2).then(() => {
//     console.log(res);
//   });
// });

//Promise chain
// getData(1)
//   .then((res) => {
//     return getData(2);
//   })
//   .then((res) => {
//     return getData(3);
//   })
//   .then((res) => {
//     console.log(res);
//   });

// //CallbackHell
// getData(1, () => {
//   console.log("Getting data2....");
//   getData(2, () => {
//     console.log("Getting Data3....");
//     getData(3, () => {
//       console.log("Getting data4...");
//       getData(4);
//     });
//   });
// });
