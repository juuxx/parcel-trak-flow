# ParcelTrackFlow 🚚

Kafka 기반 이벤트 처리로 전담 배송 흐름을 재현한 프로젝트입니다.

## 주요 기능
- 택배 예약 → 접수 승인 → 배송구역 할당 → 배차 → 배송 출발 → 배송 완료
- 각 단계별 Kafka 이벤트 발행 및 소비
- 배송 상태 추적용 Redis 캐싱 시스템
- CQRS 적용
- DDD 구조 적용
- Spring Boot 3.2 / Kafka / Redis / MySQL 기반

## 사용 기술
- Java 17
- Spring Boot 3.3.x
- Apache Kafka (Docker)
- Redis
- MySQL 8
- Springdoc OpenAPI 2.x

## 실행 방법
```bash
docker-compose -f docker/kafka-docker-compose.yml up -d
./gradlew bootRun
