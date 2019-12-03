setInterval(시계설정, 1000)

const 시데이타 = document.querySelector('[데이타-시]')
const 분데이타 = document.querySelector('[데이타-분]')
const 초데이타 = document.querySelector('[데이타-초]')

function 시계설정() {
  const 현재날짜 = new Date()
  const 초단위로 = 현재날짜.getSeconds() / 60
  const 분단위로 = (초단위로 + 현재날짜.getMinutes()) / 60
  const 시단위로 = (분단위로 + 현재날짜.getHours()) / 12

  회전설정(시데이타, 시단위로)
  회전설정(분데이타, 분단위로)
  회전설정(초데이타, 초단위로)
}

function 회전설정(element, 회전비) {
  element.style.setProperty('--rotation', 회전비 * 360)
}

시계설정()
