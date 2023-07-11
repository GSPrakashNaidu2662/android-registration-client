// Autogenerated from Pigeon (v10.0.1), do not edit directly.
// See also: https://pub.dev/packages/pigeon

#import <Foundation/Foundation.h>

@protocol FlutterBinaryMessenger;
@protocol FlutterMessageCodec;
@class FlutterError;
@class FlutterStandardTypedData;

NS_ASSUME_NONNULL_BEGIN

@class RegistrationData;

@interface RegistrationData : NSObject
/// `init` unavailable to enforce nonnull fields, see the `make` class method.
- (instancetype)init NS_UNAVAILABLE;
+ (instancetype)makeWithLanguages:(NSArray<NSString *> *)languages
    demographicsData:(NSString *)demographicsData
    biometricsData:(NSString *)biometricsData
    documentsData:(NSString *)documentsData;
@property(nonatomic, strong) NSArray<NSString *> * languages;
@property(nonatomic, copy) NSString * demographicsData;
@property(nonatomic, copy) NSString * biometricsData;
@property(nonatomic, copy) NSString * documentsData;
@end

/// The codec used by RegistrationDataApi.
NSObject<FlutterMessageCodec> *RegistrationDataApiGetCodec(void);

@protocol RegistrationDataApi
- (void)registrationRegistrationData:(RegistrationData *)registrationData completion:(void (^)(NSNumber *_Nullable, FlutterError *_Nullable))completion;
@end

extern void RegistrationDataApiSetup(id<FlutterBinaryMessenger> binaryMessenger, NSObject<RegistrationDataApi> *_Nullable api);

NS_ASSUME_NONNULL_END
