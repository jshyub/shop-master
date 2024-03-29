# 프로젝트 소개

> 상품을 관리하고, 물건을 구매할 수 있는 온라인 웹 쇼핑몰 프로젝트입니다.\
> 관리자는 상품 등록과 삭제, 상품 관리 페이지를 통해 상품 정보를 수정 및 관리할 수 있습니다.\
> 사용자는 메인 페이지에서 사진과 상품 정보를 확인할 수 있습니다.\
> 제품을 장바구니 담기 할 수 있으며, 구매 시에는 구매이력을 통해 구매 내역을 확인 및 환불 할 수 있습니다.
> 
> SpringBoot와 JPA 기반으로 웹페이지를 구현했으며, 서버를 실행했습니다.


> ### 개발 기간 및 인원
> 24.02.01 ~ 24.02.20 \
> 1명

<br/>

# 기술 스택

![html](https://img.shields.io/badge/HTML-239120?style=for-the-badge&logo=html5&logoColor=white)
![css](https://img.shields.io/badge/CSS-239120?&style=for-the-badge&logo=css3&logoColor=white)
![java](https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=JavaScript&logoColor=white)
![Bootstrap](https://img.shields.io/badge/Bootstrap-563D7C?style=for-the-badge&logo=bootstrap&logoColor=white)
![Spring](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-00000F?style=for-the-badge&logo=mysql&logoColor=white)

<br/>

# 주요 기능

### 로그인 및 로그아웃
- 로그인 시 아이디를 통해 관리자 및 유저의 계정을 구분한다.
- 관리자는 상품 등록, 상품 관리 페이지를 사용할 수 있으며 장바구니 담기 및 주문하기를 사용할 수 없다.
- 유저는 상품 등록, 상품 관리 페이지를 사용할 수 없으며 장바구니 담기 및 주문하기를 사용할 수 있다.

### 상품 상세 페이지
- 상세 페이지를 통해 상품에 대한 정보(상품명, 제조사 등)와 이미지들을 확인할 수 있다. 
- 상품 주문 시 재고가 실시간으로 반영된다.
- 재고가 0이 되면 '품절'이 표시되며, 품절된 상품은 장바구니 담기 및 주문하기가 불가하다.

### 상품 관리
- 관리자는 상품 관리 페이지를 통해 리스트 형태로 상품의 정보를 확인할 수 있다.
- 상품명을 눌러 판매 유무, 제조사, 상품명, 가격, 재고, 상품 내용, 상품 이미지 등을 수정(업데이트) 할 수 있다.
- 재고가 0이 되면 자동으로 상품의 판매 유무가 [품절] 로 바뀐다.

### 상품 등록
- 관리자는 상품을 새롭게 등록할 수 있으며, 제조사 등 상품에 대한 정보를 작성할 수 있다.
- 등록된 상품 정보는 데이터에 저장된다.

### 장바구니
- 전체선택을 통해 장바구니에 담은 모든 제품을 선택할 수 있다.
- 주장바구니 목록에서 장바구니에 담은 상품의 이름, 제조사, 금액, 수량을 확인할 수 있다.
- 총 주문 금액은 선택한 제품의 금액을 반영한다. 

### 구매이력
- 구매한 제품의 주문 시간, 제품명, 제조사, 금액, 수량을 확인할 수 있다.
- [주문취소]를 눌러 주문을 취소할 수 있으며, 버튼을 누르면 취소 완료로 바뀐다.

<br/>

# 추가 구현하고 싶은 기능

### 로그인 및 로그아웃
- 로그인 시 로그인 옆에 [유저 이름] 혹은 [관리자] 를 표시한다.

### 주문 관리
- 관리자1이 등록한 상품은 관리자2가 삭제할 수 없다. (관리자 별 구분, 본인의 상품만 관리함.)

### 상품 관리
- 리스트 형태로 볼 수 있는 제품은 최대 10개까지 출력되며, 10개가 넘어갈 시 페이지를 넘겨 확인할 수 있다.
