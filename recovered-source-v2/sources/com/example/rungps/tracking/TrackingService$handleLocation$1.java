package com.example.rungps.tracking;

import android.location.Location;
import androidx.core.view.PointerIconCompat;
import com.example.rungps.data.PointEntity;
import com.example.rungps.data.Repository;
import com.example.rungps.intervals.Cue;
import com.example.rungps.intervals.WorkoutEngine;
import com.example.rungps.intervals.WorkoutPlan;
import com.example.rungps.intervals.WorkoutProgress;
import com.example.rungps.intervals.WorkoutSegment;
import com.example.rungps.tracking.GpsTunnelEstimator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import org.maplibre.android.style.layers.Property;

/* compiled from: TrackingService.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.tracking.TrackingService$handleLocation$1", f = "TrackingService.kt", i = {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {1444, PointerIconCompat.TYPE_GRABBING, 1048}, m = "invokeSuspend", n = {"$this$launch", "$this$withLock_u24default$iv", "$this$launch", "$this$withLock_u24default$iv", "loc", "mapLoc", "nowWall", "prevTimeMs", "currTimeMs", "dtMs", "deltaM", "speedMps", "newTotalM", "prevTotalM", "$this$withLock_u24default$iv", "loc", "mapLoc", Property.SYMBOL_PLACEMENT_POINT, "nowWall"}, s = {"L$0", "L$1", "L$0", "L$1", "L$3", "L$4", "J$1", "J$2", "J$3", "J$4", "D$0", "D$1", "D$2", "D$3", "L$0", "L$2", "L$3", "L$4", "J$0"})
/* loaded from: classes3.dex */
final class TrackingService$handleLocation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ float $acc;
    final /* synthetic */ long $id;
    final /* synthetic */ Location $location;
    double D$0;
    double D$1;
    double D$2;
    double D$3;
    float F$0;
    long J$0;
    long J$1;
    long J$2;
    long J$3;
    long J$4;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ TrackingService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TrackingService$handleLocation$1(TrackingService trackingService, Location location, float f, long j, Continuation<? super TrackingService$handleLocation$1> continuation) {
        super(2, continuation);
        this.this$0 = trackingService;
        this.$location = location;
        this.$acc = f;
        this.$id = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TrackingService$handleLocation$1 trackingService$handleLocation$1 = new TrackingService$handleLocation$1(this.this$0, this.$location, this.$acc, this.$id, continuation);
        trackingService$handleLocation$1.L$0 = obj;
        return trackingService$handleLocation$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrackingService$handleLocation$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(29:0|1|(1:2)|(1:(1:(1:(29:7|8|9|10|11|(2:13|(1:15)(21:16|17|(1:19)(1:69)|(1:68)(1:27)|28|(1:67)(1:32)|33|(1:35)(1:66)|(1:37)(1:65)|(1:39)(1:64)|(1:41)(1:63)|(1:43)(1:62)|44|(1:46)|61|48|(1:50)|52|53|54|55))|70|17|(0)(0)|(1:21)|68|28|(1:30)|67|33|(0)(0)|(0)(0)|(0)(0)|(0)(0)|(0)(0)|44|(0)|61|48|(0)|52|53|54|55)(2:74|75))(10:76|77|78|79|80|81|82|83|84|(41:86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|(1:127)(7:128|80|81|82|83|84|(7:180|181|(3:193|194|(1:198))|183|(1:185)(1:192)|186|(1:188)(27:189|10|11|(0)|70|17|(0)(0)|(0)|68|28|(0)|67|33|(0)(0)|(0)(0)|(0)(0)|(0)(0)|(0)(0)|44|(0)|61|48|(0)|52|53|54|55))(0)))(0)))(1:208))(2:389|(1:391)(1:392))|209|210|211|(1:213)|(1:215)(1:385)|216|(1:218)(1:384)|219|(26:358|359|(1:361)|(1:363)(1:383)|364|365|(1:367)|(1:369)(1:382)|370|371|(1:373)(2:375|(1:377)(2:378|(1:380)(1:381)))|374|223|(3:225|(1:227)(1:354)|(12:229|230|231|(1:233)|(2:235|236)(1:353)|237|238|239|240|241|242|(3:244|245|246)(6:247|(2:249|(5:251|252|253|254|(4:334|335|336|337)(16:256|257|258|(1:260)(1:330)|261|(3:293|294|(11:299|(4:301|(3:(1:309)(1:315)|310|(2:312|(1:314)))|316|(1:318))|264|(2:266|(1:268)(10:269|270|(3:272|273|(4:275|83|84|(0)(0)))|276|181|(0)|183|(0)(0)|186|(0)(0)))|278|279|280|(1:282)|283|284|285))|263|264|(0)|278|279|280|(0)|283|284|285)))|343|253|254|(0)(0))))|355|230|231|(0)|(0)(0)|237|238|239|240|241|242|(0)(0))|222|223|(0)|355|230|231|(0)|(0)(0)|237|238|239|240|241|242|(0)(0)|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(29:0|1|2|(1:(1:(1:(29:7|8|9|10|11|(2:13|(1:15)(21:16|17|(1:19)(1:69)|(1:68)(1:27)|28|(1:67)(1:32)|33|(1:35)(1:66)|(1:37)(1:65)|(1:39)(1:64)|(1:41)(1:63)|(1:43)(1:62)|44|(1:46)|61|48|(1:50)|52|53|54|55))|70|17|(0)(0)|(1:21)|68|28|(1:30)|67|33|(0)(0)|(0)(0)|(0)(0)|(0)(0)|(0)(0)|44|(0)|61|48|(0)|52|53|54|55)(2:74|75))(10:76|77|78|79|80|81|82|83|84|(41:86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|(1:127)(7:128|80|81|82|83|84|(7:180|181|(3:193|194|(1:198))|183|(1:185)(1:192)|186|(1:188)(27:189|10|11|(0)|70|17|(0)(0)|(0)|68|28|(0)|67|33|(0)(0)|(0)(0)|(0)(0)|(0)(0)|(0)(0)|44|(0)|61|48|(0)|52|53|54|55))(0)))(0)))(1:208))(2:389|(1:391)(1:392))|209|210|211|(1:213)|(1:215)(1:385)|216|(1:218)(1:384)|219|(26:358|359|(1:361)|(1:363)(1:383)|364|365|(1:367)|(1:369)(1:382)|370|371|(1:373)(2:375|(1:377)(2:378|(1:380)(1:381)))|374|223|(3:225|(1:227)(1:354)|(12:229|230|231|(1:233)|(2:235|236)(1:353)|237|238|239|240|241|242|(3:244|245|246)(6:247|(2:249|(5:251|252|253|254|(4:334|335|336|337)(16:256|257|258|(1:260)(1:330)|261|(3:293|294|(11:299|(4:301|(3:(1:309)(1:315)|310|(2:312|(1:314)))|316|(1:318))|264|(2:266|(1:268)(10:269|270|(3:272|273|(4:275|83|84|(0)(0)))|276|181|(0)|183|(0)(0)|186|(0)(0)))|278|279|280|(1:282)|283|284|285))|263|264|(0)|278|279|280|(0)|283|284|285)))|343|253|254|(0)(0))))|355|230|231|(0)|(0)(0)|237|238|239|240|241|242|(0)(0))|222|223|(0)|355|230|231|(0)|(0)(0)|237|238|239|240|241|242|(0)(0)|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(39:86|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125) */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0506, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0507, code lost:
    
        r1 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x068b, code lost:
    
        r3 = r19;
        r8 = r27;
        r5 = r31;
        r6 = r39;
        r10 = r50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x050b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x050c, code lost:
    
        r41 = r4;
        r36 = r5;
        r50 = r6;
        r39 = r14;
        r1 = r21;
        r22 = r32;
        r19 = r34;
        r37 = r32;
        r31 = r12;
        r34 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x055b, code lost:
    
        r27 = r10;
        r45 = r12;
        r43 = r24;
        r24 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0526, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0527, code lost:
    
        r41 = r4;
        r36 = r5;
        r50 = r6;
        r39 = r14;
        r1 = r21;
        r19 = r34;
        r37 = r32;
        r31 = r12;
        r34 = r8;
        r22 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0541, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0542, code lost:
    
        r41 = r4;
        r36 = r5;
        r50 = r6;
        r34 = r8;
        r19 = r34;
        r39 = r14;
        r1 = r21;
        r22 = r32;
        r37 = r32;
        r31 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x056a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x056b, code lost:
    
        r41 = r4;
        r36 = r5;
        r50 = r6;
        r45 = r12;
        r39 = r14;
        r1 = r21;
        r22 = r32;
        r19 = r34;
        r37 = r32;
        r31 = r12;
        r34 = r8;
        r43 = r24;
        r24 = r33;
        r27 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x058f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0590, code lost:
    
        r41 = r4;
        r36 = r5;
        r45 = r12;
        r39 = r14;
        r1 = r21;
        r22 = r32;
        r19 = r34;
        r37 = r32;
        r31 = r12;
        r27 = r49;
        r50 = r6;
        r34 = r8;
        r43 = r24;
        r24 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x05b4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x05b5, code lost:
    
        r41 = r4;
        r36 = r5;
        r45 = r12;
        r39 = r14;
        r1 = r21;
        r24 = r33;
        r22 = r32;
        r19 = r34;
        r37 = r32;
        r31 = r12;
        r27 = r49;
        r50 = r6;
        r34 = r8;
        r43 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x05d9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x05da, code lost:
    
        r41 = r4;
        r36 = r5;
        r43 = r10;
        r31 = r12;
        r26 = r13;
        r39 = r14;
        r1 = r21;
        r45 = r24;
        r24 = r33;
        r22 = r32;
        r19 = r34;
        r37 = r32;
        r27 = r49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0687, code lost:
    
        r50 = r6;
        r34 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x05f8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x05f9, code lost:
    
        r41 = r4;
        r36 = r5;
        r43 = r10;
        r37 = r32;
        r39 = r14;
        r1 = r21;
        r45 = r24;
        r31 = r26;
        r24 = r33;
        r22 = r32;
        r19 = r34;
        r27 = r49;
        r50 = r6;
        r34 = r8;
        r26 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x061f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0620, code lost:
    
        r41 = r4;
        r36 = r5;
        r43 = r10;
        r37 = r32;
        r38 = r13;
        r39 = r14;
        r1 = r21;
        r45 = r24;
        r31 = r26;
        r24 = r33;
        r22 = r32;
        r19 = r34;
        r27 = r49;
        r26 = r51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x063f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0640, code lost:
    
        r36 = r5;
        r43 = r10;
        r37 = r32;
        r38 = r13;
        r39 = r14;
        r1 = r21;
        r45 = r24;
        r31 = r26;
        r24 = r33;
        r22 = r32;
        r19 = r34;
        r27 = r49;
        r26 = r51;
        r41 = r52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0663, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0664, code lost:
    
        r43 = r10;
        r37 = r32;
        r38 = r13;
        r39 = r14;
        r1 = r21;
        r45 = r24;
        r31 = r26;
        r24 = r33;
        r22 = r32;
        r19 = r34;
        r27 = r49;
        r26 = r51;
        r41 = r52;
        r36 = r53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0288, code lost:
    
        r7 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x003a, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0284, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0285, code lost:
    
        r7 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0037, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x09a3, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x099e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x099f, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x015b, code lost:
    
        r2 = r10.lastSmoothed;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x09ac, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x09a7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x09a8, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x08d0, code lost:
    
        if (r3 >= (r8 - 5.0d)) goto L315;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x079f A[Catch: Exception -> 0x08e9, all -> 0x08ed, TryCatch #39 {Exception -> 0x08e9, all -> 0x08ed, blocks: (B:11:0x0781, B:13:0x079f, B:17:0x07b5, B:19:0x07c3, B:21:0x07d2, B:23:0x07d8, B:25:0x07de, B:27:0x07ea, B:28:0x07f1, B:30:0x07f7, B:32:0x07fd, B:33:0x080a, B:35:0x0834, B:37:0x0843, B:39:0x084e, B:41:0x085d, B:43:0x0868, B:44:0x0875, B:46:0x08c3, B:48:0x08dd, B:50:0x08e6, B:61:0x08d2, B:70:0x07ac), top: B:10:0x0781 }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x074c A[Catch: Exception -> 0x09af, all -> 0x09b7, TryCatch #1 {Exception -> 0x09af, blocks: (B:194:0x0725, B:198:0x0739, B:183:0x073c, B:185:0x074c, B:186:0x0759), top: B:193:0x0725 }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x077c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x077d  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0725 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x07c3 A[Catch: Exception -> 0x08e9, all -> 0x08ed, TryCatch #39 {Exception -> 0x08e9, all -> 0x08ed, blocks: (B:11:0x0781, B:13:0x079f, B:17:0x07b5, B:19:0x07c3, B:21:0x07d2, B:23:0x07d8, B:25:0x07de, B:27:0x07ea, B:28:0x07f1, B:30:0x07f7, B:32:0x07fd, B:33:0x080a, B:35:0x0834, B:37:0x0843, B:39:0x084e, B:41:0x085d, B:43:0x0868, B:44:0x0875, B:46:0x08c3, B:48:0x08dd, B:50:0x08e6, B:61:0x08d2, B:70:0x07ac), top: B:10:0x0781 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x07d2 A[Catch: Exception -> 0x08e9, all -> 0x08ed, TryCatch #39 {Exception -> 0x08e9, all -> 0x08ed, blocks: (B:11:0x0781, B:13:0x079f, B:17:0x07b5, B:19:0x07c3, B:21:0x07d2, B:23:0x07d8, B:25:0x07de, B:27:0x07ea, B:28:0x07f1, B:30:0x07f7, B:32:0x07fd, B:33:0x080a, B:35:0x0834, B:37:0x0843, B:39:0x084e, B:41:0x085d, B:43:0x0868, B:44:0x0875, B:46:0x08c3, B:48:0x08dd, B:50:0x08e6, B:61:0x08d2, B:70:0x07ac), top: B:10:0x0781 }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0214 A[Catch: all -> 0x0036, Exception -> 0x003a, TRY_ENTER, TryCatch #37 {Exception -> 0x003a, all -> 0x0036, blocks: (B:8:0x002e, B:215:0x012e, B:218:0x013e, B:225:0x0214, B:229:0x022d, B:235:0x024b, B:363:0x0182, B:369:0x01a3), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x024b A[Catch: all -> 0x0036, Exception -> 0x003a, TRY_ENTER, TRY_LEAVE, TryCatch #37 {Exception -> 0x003a, all -> 0x0036, blocks: (B:8:0x002e, B:215:0x012e, B:218:0x013e, B:225:0x0214, B:229:0x022d, B:235:0x024b, B:363:0x0182, B:369:0x01a3), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x027a A[Catch: all -> 0x0284, Exception -> 0x0288, TRY_ENTER, TRY_LEAVE, TryCatch #31 {Exception -> 0x0288, all -> 0x0284, blocks: (B:244:0x027a, B:249:0x02c3, B:251:0x02c9, B:272:0x03ae), top: B:242:0x0278 }] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x028b A[Catch: all -> 0x099e, Exception -> 0x09a3, TRY_ENTER, TRY_LEAVE, TryCatch #33 {Exception -> 0x09a3, all -> 0x099e, blocks: (B:241:0x0274, B:247:0x028b, B:254:0x02dc), top: B:240:0x0274 }] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0397 A[Catch: all -> 0x0999, Exception -> 0x099c, TryCatch #38 {Exception -> 0x099c, all -> 0x0999, blocks: (B:258:0x0304, B:261:0x0314, B:264:0x0391, B:266:0x0397, B:269:0x039f), top: B:257:0x0304 }] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x097e A[Catch: all -> 0x0997, Exception -> 0x09a4, TryCatch #35 {Exception -> 0x09a4, all -> 0x0997, blocks: (B:280:0x08f3, B:282:0x097e, B:283:0x098e), top: B:279:0x08f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x07f7 A[Catch: Exception -> 0x08e9, all -> 0x08ed, TryCatch #39 {Exception -> 0x08e9, all -> 0x08ed, blocks: (B:11:0x0781, B:13:0x079f, B:17:0x07b5, B:19:0x07c3, B:21:0x07d2, B:23:0x07d8, B:25:0x07de, B:27:0x07ea, B:28:0x07f1, B:30:0x07f7, B:32:0x07fd, B:33:0x080a, B:35:0x0834, B:37:0x0843, B:39:0x084e, B:41:0x085d, B:43:0x0868, B:44:0x0875, B:46:0x08c3, B:48:0x08dd, B:50:0x08e6, B:61:0x08d2, B:70:0x07ac), top: B:10:0x0781 }] */
    /* JADX WARN: Removed duplicated region for block: B:334:0x02f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0834 A[Catch: Exception -> 0x08e9, all -> 0x08ed, TryCatch #39 {Exception -> 0x08e9, all -> 0x08ed, blocks: (B:11:0x0781, B:13:0x079f, B:17:0x07b5, B:19:0x07c3, B:21:0x07d2, B:23:0x07d8, B:25:0x07de, B:27:0x07ea, B:28:0x07f1, B:30:0x07f7, B:32:0x07fd, B:33:0x080a, B:35:0x0834, B:37:0x0843, B:39:0x084e, B:41:0x085d, B:43:0x0868, B:44:0x0875, B:46:0x08c3, B:48:0x08dd, B:50:0x08e6, B:61:0x08d2, B:70:0x07ac), top: B:10:0x0781 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0843 A[Catch: Exception -> 0x08e9, all -> 0x08ed, TryCatch #39 {Exception -> 0x08e9, all -> 0x08ed, blocks: (B:11:0x0781, B:13:0x079f, B:17:0x07b5, B:19:0x07c3, B:21:0x07d2, B:23:0x07d8, B:25:0x07de, B:27:0x07ea, B:28:0x07f1, B:30:0x07f7, B:32:0x07fd, B:33:0x080a, B:35:0x0834, B:37:0x0843, B:39:0x084e, B:41:0x085d, B:43:0x0868, B:44:0x0875, B:46:0x08c3, B:48:0x08dd, B:50:0x08e6, B:61:0x08d2, B:70:0x07ac), top: B:10:0x0781 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x084e A[Catch: Exception -> 0x08e9, all -> 0x08ed, TryCatch #39 {Exception -> 0x08e9, all -> 0x08ed, blocks: (B:11:0x0781, B:13:0x079f, B:17:0x07b5, B:19:0x07c3, B:21:0x07d2, B:23:0x07d8, B:25:0x07de, B:27:0x07ea, B:28:0x07f1, B:30:0x07f7, B:32:0x07fd, B:33:0x080a, B:35:0x0834, B:37:0x0843, B:39:0x084e, B:41:0x085d, B:43:0x0868, B:44:0x0875, B:46:0x08c3, B:48:0x08dd, B:50:0x08e6, B:61:0x08d2, B:70:0x07ac), top: B:10:0x0781 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x085d A[Catch: Exception -> 0x08e9, all -> 0x08ed, TryCatch #39 {Exception -> 0x08e9, all -> 0x08ed, blocks: (B:11:0x0781, B:13:0x079f, B:17:0x07b5, B:19:0x07c3, B:21:0x07d2, B:23:0x07d8, B:25:0x07de, B:27:0x07ea, B:28:0x07f1, B:30:0x07f7, B:32:0x07fd, B:33:0x080a, B:35:0x0834, B:37:0x0843, B:39:0x084e, B:41:0x085d, B:43:0x0868, B:44:0x0875, B:46:0x08c3, B:48:0x08dd, B:50:0x08e6, B:61:0x08d2, B:70:0x07ac), top: B:10:0x0781 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0868 A[Catch: Exception -> 0x08e9, all -> 0x08ed, TryCatch #39 {Exception -> 0x08e9, all -> 0x08ed, blocks: (B:11:0x0781, B:13:0x079f, B:17:0x07b5, B:19:0x07c3, B:21:0x07d2, B:23:0x07d8, B:25:0x07de, B:27:0x07ea, B:28:0x07f1, B:30:0x07f7, B:32:0x07fd, B:33:0x080a, B:35:0x0834, B:37:0x0843, B:39:0x084e, B:41:0x085d, B:43:0x0868, B:44:0x0875, B:46:0x08c3, B:48:0x08dd, B:50:0x08e6, B:61:0x08d2, B:70:0x07ac), top: B:10:0x0781 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x08c3 A[Catch: Exception -> 0x08e9, all -> 0x08ed, TryCatch #39 {Exception -> 0x08e9, all -> 0x08ed, blocks: (B:11:0x0781, B:13:0x079f, B:17:0x07b5, B:19:0x07c3, B:21:0x07d2, B:23:0x07d8, B:25:0x07de, B:27:0x07ea, B:28:0x07f1, B:30:0x07f7, B:32:0x07fd, B:33:0x080a, B:35:0x0834, B:37:0x0843, B:39:0x084e, B:41:0x085d, B:43:0x0868, B:44:0x0875, B:46:0x08c3, B:48:0x08dd, B:50:0x08e6, B:61:0x08d2, B:70:0x07ac), top: B:10:0x0781 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x08e6 A[Catch: Exception -> 0x08e9, all -> 0x08ed, TRY_LEAVE, TryCatch #39 {Exception -> 0x08e9, all -> 0x08ed, blocks: (B:11:0x0781, B:13:0x079f, B:17:0x07b5, B:19:0x07c3, B:21:0x07d2, B:23:0x07d8, B:25:0x07de, B:27:0x07ea, B:28:0x07f1, B:30:0x07f7, B:32:0x07fd, B:33:0x080a, B:35:0x0834, B:37:0x0843, B:39:0x084e, B:41:0x085d, B:43:0x0868, B:44:0x0875, B:46:0x08c3, B:48:0x08dd, B:50:0x08e6, B:61:0x08d2, B:70:0x07ac), top: B:10:0x0781 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0873  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0864  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0859  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x084a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x083f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x07ce  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03dd A[Catch: all -> 0x0704, Exception -> 0x0708, TRY_LEAVE, TryCatch #30 {Exception -> 0x0708, all -> 0x0704, blocks: (B:84:0x03d5, B:86:0x03dd), top: B:83:0x03d5 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:128:0x04ea -> B:80:0x04f4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:134:0x0695 -> B:82:0x069e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Mutex mutex;
        Mutex mutex2;
        Location location;
        float f;
        TrackingService trackingService;
        CoroutineScope coroutineScope;
        long j;
        boolean z;
        Location location2;
        float f2;
        long j2;
        Location location3;
        Location location4;
        long j3;
        Long boxLong;
        long coerceAtLeast;
        GpsTunnelEstimator gpsTunnelEstimator;
        Location location5;
        int i;
        long j4;
        Object obj3;
        long j5;
        long j6;
        int i2;
        double d;
        Location location6;
        double d2;
        GpsTunnelEstimator gpsTunnelEstimator2;
        boolean z2;
        long j7;
        boolean z3;
        boolean z4;
        boolean z5;
        int i3;
        int i4;
        String str;
        boolean z6;
        boolean z7;
        long j8;
        boolean z8;
        long activeElapsedMs;
        long j9;
        double d3;
        long j10;
        String str2;
        boolean z9;
        long j11;
        Integer num;
        Double d4;
        Long l;
        int i5;
        Long l2;
        int i6;
        Long l3;
        long j12;
        long activeElapsedMs2;
        double d5;
        boolean z10;
        double d6;
        TrackingService$handleLocation$1 trackingService$handleLocation$1;
        int i7;
        Object obj4;
        float f3;
        Location location7;
        TrackingService trackingService2;
        double d7;
        Location location8;
        double d8;
        long j13;
        long j14;
        double d9;
        Location location9;
        Object obj5;
        Object obj6;
        double d10;
        Location location10;
        double d11;
        long j15;
        CoroutineScope coroutineScope2;
        float f4;
        TrackingService trackingService3;
        long j16;
        long j17;
        double d12;
        Mutex mutex3;
        double d13;
        long j18;
        long j19;
        Location location11;
        Location location12;
        int i8;
        PointEntity pointEntity;
        Repository repo;
        Mutex mutex4;
        long j20;
        TrackingService trackingService4;
        Object obj7;
        Mutex mutex5;
        long j21;
        long j22;
        Location location13;
        TrackingService trackingService5;
        long j23;
        Location location14;
        long j24;
        double d14;
        Object obj8;
        Throwable th;
        double d15;
        double d16;
        Mutex mutex6;
        long j25;
        double d17;
        double d18;
        long j26;
        long activeElapsedMs3;
        double d19;
        int i9;
        long j27;
        int i10;
        int i11;
        double d20;
        float f5;
        double d21;
        double d22;
        long j28;
        Repository repo2;
        int i12;
        Object insertRunSplit;
        long j29;
        long activeElapsedMs4;
        WorkoutEngine workoutEngine;
        Double d23;
        Pair<WorkoutProgress, List<Cue>> pair;
        List<Cue> component2;
        WorkoutPlan workoutPlan;
        long j30;
        double d24;
        long j31;
        String str3;
        long j32;
        Integer num2;
        Double d25;
        Long l4;
        int i13;
        Long l5;
        int i14;
        Long l6;
        long j33;
        double d26;
        double d27;
        double d28;
        List<WorkoutSegment> segments;
        WorkoutPlan workoutPlan2;
        List<WorkoutSegment> segments2;
        WorkoutSegment workoutSegment;
        double d29;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i15 = this.label;
        try {
        } catch (Exception unused) {
        } catch (Throwable th2) {
            th = th2;
        }
        if (i15 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
            mutex2 = this.this$0.locationMutex;
            location = this.$location;
            float f6 = this.$acc;
            TrackingService trackingService6 = this.this$0;
            long j34 = this.$id;
            this.L$0 = coroutineScope3;
            this.L$1 = mutex2;
            this.L$2 = location;
            this.L$3 = trackingService6;
            this.F$0 = f6;
            this.J$0 = j34;
            this.label = 1;
            if (mutex2.lock(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            f = f6;
            trackingService = trackingService6;
            coroutineScope = coroutineScope3;
            mutex = mutex2;
            j = j34;
        } else if (i15 == 1) {
            j = this.J$0;
            float f7 = this.F$0;
            TrackingService trackingService7 = (TrackingService) this.L$3;
            location = (Location) this.L$2;
            Mutex mutex7 = (Mutex) this.L$1;
            CoroutineScope coroutineScope4 = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            f = f7;
            trackingService = trackingService7;
            mutex = mutex7;
            coroutineScope = coroutineScope4;
        } else {
            if (i15 != 2) {
                if (i15 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j20 = this.J$0;
                pointEntity = (PointEntity) this.L$4;
                location8 = (Location) this.L$3;
                location7 = (Location) this.L$2;
                TrackingService trackingService8 = (TrackingService) this.L$1;
                Mutex mutex8 = (Mutex) this.L$0;
                ResultKt.throwOnFailure(obj);
                trackingService4 = trackingService8;
                mutex4 = mutex8;
                obj7 = null;
                try {
                    trackingService4.lastLoc = location7;
                    trackingService4.lastPointTimeMs = pointEntity.getTimeMs();
                    j29 = trackingService4.totalSteps;
                    trackingService4.stepsAtLastPoint = j29;
                    activeElapsedMs4 = trackingService4.activeElapsedMs(j20);
                    trackingService4.maybeAnnounceElapsed(activeElapsedMs4);
                    workoutEngine = trackingService4.engine;
                } catch (Exception unused2) {
                } catch (Throwable th3) {
                    th = th3;
                    obj2 = obj7;
                    mutex = mutex4;
                    mutex.unlock(obj2);
                    throw th;
                }
                if (workoutEngine != null) {
                    d29 = trackingService4.totalDistanceM;
                    pair = workoutEngine.onUpdate(activeElapsedMs4, d29);
                    if (pair != null) {
                        d23 = null;
                        WorkoutProgress component1 = pair.component1();
                        component2 = pair.component2();
                        Integer boxInt = component1 != null ? Boxing.boxInt(component1.getSegmentIndex()) : d23;
                        String label = (boxInt != 0 || workoutPlan2 == null || (segments2 = workoutPlan2.getSegments()) == null || (workoutSegment = (WorkoutSegment) CollectionsKt.getOrNull(segments2, boxInt.intValue())) == null) ? d23 : workoutSegment.getLabel();
                        workoutPlan = trackingService4.plan;
                        Integer boxInt2 = (workoutPlan != null || (segments = workoutPlan.getSegments()) == null) ? d23 : Boxing.boxInt(segments.size());
                        TrackingState trackingState = TrackingState.INSTANCE;
                        j30 = trackingService4.startedAtMs;
                        Long boxLong2 = Boxing.boxLong(j30);
                        d24 = trackingService4.totalDistanceM;
                        j31 = trackingService4.totalSteps;
                        Double boxDouble = Boxing.boxDouble(location8.getLatitude());
                        Double boxDouble2 = Boxing.boxDouble(location8.getLongitude());
                        str3 = trackingService4.currentPlanType;
                        Long boxLong3 = component1 != null ? Boxing.boxLong(component1.getSegmentElapsedMs()) : d23;
                        Long segmentRemainingMs = component1 != null ? component1.getSegmentRemainingMs() : d23;
                        Double boxDouble3 = component1 != null ? Boxing.boxDouble(component1.getSegmentDistanceM()) : d23;
                        Double segmentRemainingM = component1 != null ? component1.getSegmentRemainingM() : d23;
                        Boolean boxBoolean = component1 != null ? Boxing.boxBoolean(component1.getFinished()) : d23;
                        j32 = trackingService4.splitStartElapsedMs;
                        long coerceAtLeast2 = RangesKt.coerceAtLeast(activeElapsedMs4 - j32, 0L);
                        num2 = trackingService4.targetPaceSecPerKm;
                        d25 = trackingService4.goalDistanceM;
                        l4 = trackingService4.goalTimeMs;
                        i13 = trackingService4.splitCount;
                        l5 = trackingService4.lastSplitMs;
                        i14 = trackingService4.lapCount;
                        l6 = trackingService4.lastLapMs;
                        trackingState.update(new TrackingUiState(true, boxLong2, activeElapsedMs4, d24, j31, boxDouble, boxDouble2, null, null, str3, label, boxInt, boxInt2, boxLong3, segmentRemainingMs, boxDouble3, segmentRemainingM, boxBoolean, false, false, coerceAtLeast2, num2, d25, l4, i13, l5, i14, l6, 384, null));
                        j33 = trackingService4.lastNotificationAtMs;
                        if (j20 - j33 < 5000) {
                            d27 = trackingService4.totalDistanceM;
                            d28 = trackingService4.nextKmBeepAtM;
                        }
                        trackingService4.lastNotificationAtMs = j20;
                        d26 = trackingService4.totalDistanceM;
                        trackingService4.updateNotification(activeElapsedMs4, d26, label);
                        if (!component2.isEmpty()) {
                            trackingService4.emitCues(component2);
                        }
                        obj2 = obj7;
                        mutex = mutex4;
                        Unit unit = Unit.INSTANCE;
                        mutex.unlock(obj2);
                        return Unit.INSTANCE;
                    }
                }
                d23 = null;
                pair = TuplesKt.to(null, CollectionsKt.emptyList());
                WorkoutProgress component12 = pair.component1();
                component2 = pair.component2();
                if (component12 != null) {
                }
                if (boxInt != 0) {
                    workoutPlan2 = trackingService4.plan;
                }
                workoutPlan = trackingService4.plan;
                if (workoutPlan != null) {
                }
                TrackingState trackingState2 = TrackingState.INSTANCE;
                j30 = trackingService4.startedAtMs;
                Long boxLong22 = Boxing.boxLong(j30);
                d24 = trackingService4.totalDistanceM;
                j31 = trackingService4.totalSteps;
                Double boxDouble4 = Boxing.boxDouble(location8.getLatitude());
                Double boxDouble22 = Boxing.boxDouble(location8.getLongitude());
                str3 = trackingService4.currentPlanType;
                if (component12 != null) {
                }
                if (component12 != null) {
                }
                if (component12 != null) {
                }
                if (component12 != null) {
                }
                if (component12 != null) {
                }
                j32 = trackingService4.splitStartElapsedMs;
                long coerceAtLeast22 = RangesKt.coerceAtLeast(activeElapsedMs4 - j32, 0L);
                num2 = trackingService4.targetPaceSecPerKm;
                d25 = trackingService4.goalDistanceM;
                l4 = trackingService4.goalTimeMs;
                i13 = trackingService4.splitCount;
                l5 = trackingService4.lastSplitMs;
                i14 = trackingService4.lapCount;
                l6 = trackingService4.lastLapMs;
                trackingState2.update(new TrackingUiState(true, boxLong22, activeElapsedMs4, d24, j31, boxDouble4, boxDouble22, null, null, str3, label, boxInt, boxInt2, boxLong3, segmentRemainingMs, boxDouble3, segmentRemainingM, boxBoolean, false, false, coerceAtLeast22, num2, d25, l4, i13, l5, i14, l6, 384, null));
                j33 = trackingService4.lastNotificationAtMs;
                if (j20 - j33 < 5000) {
                }
                trackingService4.lastNotificationAtMs = j20;
                d26 = trackingService4.totalDistanceM;
                trackingService4.updateNotification(activeElapsedMs4, d26, label);
                if (!component2.isEmpty()) {
                }
                obj2 = obj7;
                mutex = mutex4;
                Unit unit2 = Unit.INSTANCE;
                mutex.unlock(obj2);
                return Unit.INSTANCE;
            }
            double d30 = this.D$3;
            double d31 = this.D$2;
            double d32 = this.D$1;
            double d33 = this.D$0;
            long j35 = this.J$4;
            long j36 = this.J$3;
            long j37 = this.J$2;
            long j38 = this.J$1;
            long j39 = this.J$0;
            float f8 = this.F$0;
            Location location15 = (Location) this.L$4;
            Location location16 = (Location) this.L$3;
            TrackingService trackingService9 = (TrackingService) this.L$2;
            Mutex mutex9 = (Mutex) this.L$1;
            CoroutineScope coroutineScope5 = (CoroutineScope) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                insertRunSplit = obj;
                d14 = d30;
                j24 = j36;
                j22 = j37;
                j21 = j38;
                location14 = location15;
                location13 = location16;
                trackingService5 = trackingService9;
                mutex5 = mutex9;
                obj5 = null;
                j23 = j39;
                obj8 = coroutine_suspended;
            } catch (Throwable th4) {
                th = th4;
                d14 = d30;
                j24 = j36;
                j22 = j37;
                j21 = j38;
                location14 = location15;
                location13 = location16;
                trackingService5 = trackingService9;
                mutex5 = mutex9;
                obj5 = null;
                j23 = j39;
                obj8 = coroutine_suspended;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    Result.m7905constructorimpl(ResultKt.createFailure(th));
                    double d34 = d33;
                    d11 = d32;
                    j15 = j35;
                    location10 = location14;
                    coroutineScope2 = coroutineScope5;
                    location9 = location13;
                    j17 = j22;
                    d13 = d31;
                    f4 = f8;
                    j18 = j24;
                    j19 = j23;
                    j16 = j21;
                    obj6 = obj8;
                    d10 = d34;
                    d12 = d14;
                    mutex3 = mutex5;
                    trackingService3 = trackingService5;
                    d15 = trackingService3.nextKmBeepAtM;
                    if (d13 < d15) {
                    }
                } catch (Exception unused3) {
                    obj2 = obj5;
                    mutex = mutex5;
                    Unit unit22 = Unit.INSTANCE;
                    mutex.unlock(obj2);
                    return Unit.INSTANCE;
                } catch (Throwable th5) {
                    th = th5;
                    obj2 = obj5;
                    mutex = mutex5;
                    mutex.unlock(obj2);
                    throw th;
                }
            }
            try {
                try {
                } catch (Throwable th6) {
                    th = th6;
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m7905constructorimpl(ResultKt.createFailure(th));
                    double d342 = d33;
                    d11 = d32;
                    j15 = j35;
                    location10 = location14;
                    coroutineScope2 = coroutineScope5;
                    location9 = location13;
                    j17 = j22;
                    d13 = d31;
                    f4 = f8;
                    j18 = j24;
                    j19 = j23;
                    j16 = j21;
                    obj6 = obj8;
                    d10 = d342;
                    d12 = d14;
                    mutex3 = mutex5;
                    trackingService3 = trackingService5;
                    d15 = trackingService3.nextKmBeepAtM;
                    if (d13 < d15) {
                    }
                }
                Result.m7905constructorimpl(Boxing.boxLong(((Number) insertRunSplit).longValue()));
                d15 = trackingService3.nextKmBeepAtM;
            } catch (Exception unused4) {
                mutex5 = mutex3;
            } catch (Throwable th7) {
                th = th7;
                mutex5 = mutex3;
            }
            double d3422 = d33;
            d11 = d32;
            j15 = j35;
            location10 = location14;
            coroutineScope2 = coroutineScope5;
            location9 = location13;
            j17 = j22;
            d13 = d31;
            f4 = f8;
            j18 = j24;
            j19 = j23;
            j16 = j21;
            obj6 = obj8;
            d10 = d3422;
            d12 = d14;
            mutex3 = mutex5;
            trackingService3 = trackingService5;
            if (d13 < d15) {
                try {
                    d16 = trackingService3.nextKmBeepAtM;
                    TrackingService trackingService10 = trackingService3;
                    activeElapsedMs3 = trackingService10.activeElapsedMs(RangesKt.coerceIn((long) (j17 + (j15 * RangesKt.coerceIn((d16 - d12) / d10, 0.0d, 1.0d))), j17, j25));
                    d19 = trackingService10.nextKmBeepAtM;
                    trackingService10.nextKmBeepAtM = d19 + 1000.0d;
                    i9 = trackingService10.kmBeepCount;
                    trackingService10.kmBeepCount = i9 + 1;
                    j27 = trackingService10.splitStartElapsedMs;
                    long coerceAtLeast3 = RangesKt.coerceAtLeast(activeElapsedMs3 - j27, 0L);
                    i10 = trackingService10.kmBeepCount;
                    trackingService10.announceKm(i10, coerceAtLeast3);
                    i11 = trackingService10.splitCount;
                    trackingService10.splitCount = i11 + 1;
                    trackingService10.splitStartElapsedMs = activeElapsedMs3;
                    trackingService10.lastSplitMs = Boxing.boxLong(coerceAtLeast3);
                    Result.Companion companion3 = Result.INSTANCE;
                    repo2 = trackingService10.getRepo();
                    i12 = trackingService10.splitCount;
                    CoroutineScope coroutineScope6 = coroutineScope2;
                    this.L$0 = coroutineScope6;
                    this.L$1 = mutex6;
                    this.L$2 = trackingService10;
                    Location location17 = location9;
                    this.L$3 = location17;
                    trackingService5 = trackingService10;
                    Location location18 = location10;
                    this.L$4 = location18;
                    float f9 = f4;
                    this.F$0 = f9;
                    this.J$0 = j26;
                    location14 = location18;
                    long j40 = j16;
                    this.J$1 = j40;
                    this.J$2 = j17;
                    long j41 = j17;
                    this.J$3 = j25;
                    this.J$4 = j15;
                    this.D$0 = d10;
                    double d35 = d11;
                    this.D$1 = d35;
                    this.D$2 = d18;
                    this.D$3 = d17;
                    this.label = 2;
                    location13 = location17;
                    coroutineScope5 = coroutineScope6;
                    j28 = j15;
                    f5 = f9;
                    d20 = d10;
                    d21 = d18;
                    j23 = j26;
                    d14 = d17;
                    d22 = d35;
                    j22 = j41;
                    j24 = j25;
                    mutex5 = mutex6;
                    j21 = j40;
                    insertRunSplit = repo2.insertRunSplit(j26, "KM", i12, activeElapsedMs3, coerceAtLeast3, 1000.0d, this);
                    obj8 = obj6;
                } catch (Exception unused5) {
                    mutex5 = mutex6;
                    obj2 = obj5;
                    mutex = mutex5;
                    Unit unit222 = Unit.INSTANCE;
                    mutex.unlock(obj2);
                    return Unit.INSTANCE;
                } catch (Throwable th8) {
                    th = th8;
                    mutex5 = mutex6;
                    obj2 = obj5;
                    mutex = mutex5;
                    mutex.unlock(obj2);
                    throw th;
                }
                mutex6 = mutex3;
                j25 = j18;
                d17 = d12;
                d18 = d13;
                j26 = j19;
                if (insertRunSplit == obj8) {
                    return obj8;
                }
                d31 = d21;
                d32 = d22;
                f8 = f5;
                d33 = d20;
                j35 = j28;
                Result.m7905constructorimpl(Boxing.boxLong(((Number) insertRunSplit).longValue()));
                double d34222 = d33;
                d11 = d32;
                j15 = j35;
                location10 = location14;
                coroutineScope2 = coroutineScope5;
                location9 = location13;
                j17 = j22;
                d13 = d31;
                f4 = f8;
                j18 = j24;
                j19 = j23;
                j16 = j21;
                obj6 = obj8;
                d10 = d34222;
                d12 = d14;
                mutex3 = mutex5;
                trackingService3 = trackingService5;
                d15 = trackingService3.nextKmBeepAtM;
                if (d13 < d15) {
                    Mutex mutex10 = mutex3;
                    obj4 = obj6;
                    i7 = 3;
                    trackingService$handleLocation$1 = this;
                    obj2 = obj5;
                    j13 = j18;
                    location8 = location10;
                    d8 = d11;
                    f3 = f4;
                    j14 = j19;
                    mutex = mutex10;
                    trackingService2 = trackingService3;
                    d7 = d10;
                    location7 = location9;
                    j4 = j16;
                    if (f3 <= 25.0f) {
                        try {
                            try {
                                trackingService2.lastGoodLoc = new Location(location7);
                                if (0.5d <= d8 && d8 <= 12.0d) {
                                    trackingService2.lastGoodSpeedMps = d8;
                                }
                            } catch (Exception unused6) {
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            mutex.unlock(obj2);
                            throw th;
                        }
                    }
                    pointEntity = new PointEntity(0L, j14, j13, location8.getLatitude(), location8.getLongitude(), f3, !location7.hasAltitude() ? Boxing.boxDouble(location8.getAltitude()) : null, d7, 1, null);
                    repo = trackingService2.getRepo();
                    trackingService$handleLocation$1.L$0 = mutex;
                    trackingService$handleLocation$1.L$1 = trackingService2;
                    trackingService$handleLocation$1.L$2 = location7;
                    trackingService$handleLocation$1.L$3 = location8;
                    trackingService$handleLocation$1.L$4 = pointEntity;
                    trackingService$handleLocation$1.J$0 = j4;
                    trackingService$handleLocation$1.label = i7;
                    if (repo.insertPoint(pointEntity, trackingService$handleLocation$1) != obj4) {
                        return obj4;
                    }
                    mutex4 = mutex;
                    j20 = j4;
                    trackingService4 = trackingService2;
                    obj7 = obj2;
                    trackingService4.lastLoc = location7;
                    trackingService4.lastPointTimeMs = pointEntity.getTimeMs();
                    j29 = trackingService4.totalSteps;
                    trackingService4.stepsAtLastPoint = j29;
                    activeElapsedMs4 = trackingService4.activeElapsedMs(j20);
                    trackingService4.maybeAnnounceElapsed(activeElapsedMs4);
                    workoutEngine = trackingService4.engine;
                    if (workoutEngine != null) {
                    }
                    d23 = null;
                    pair = TuplesKt.to(null, CollectionsKt.emptyList());
                    WorkoutProgress component122 = pair.component1();
                    component2 = pair.component2();
                    if (component122 != null) {
                    }
                    if (boxInt != 0) {
                    }
                    workoutPlan = trackingService4.plan;
                    if (workoutPlan != null) {
                    }
                    TrackingState trackingState22 = TrackingState.INSTANCE;
                    j30 = trackingService4.startedAtMs;
                    Long boxLong222 = Boxing.boxLong(j30);
                    d24 = trackingService4.totalDistanceM;
                    j31 = trackingService4.totalSteps;
                    Double boxDouble42 = Boxing.boxDouble(location8.getLatitude());
                    Double boxDouble222 = Boxing.boxDouble(location8.getLongitude());
                    str3 = trackingService4.currentPlanType;
                    if (component122 != null) {
                    }
                    if (component122 != null) {
                    }
                    if (component122 != null) {
                    }
                    if (component122 != null) {
                    }
                    if (component122 != null) {
                    }
                    j32 = trackingService4.splitStartElapsedMs;
                    long coerceAtLeast222 = RangesKt.coerceAtLeast(activeElapsedMs4 - j32, 0L);
                    num2 = trackingService4.targetPaceSecPerKm;
                    d25 = trackingService4.goalDistanceM;
                    l4 = trackingService4.goalTimeMs;
                    i13 = trackingService4.splitCount;
                    l5 = trackingService4.lastSplitMs;
                    i14 = trackingService4.lapCount;
                    l6 = trackingService4.lastLapMs;
                    trackingState22.update(new TrackingUiState(true, boxLong222, activeElapsedMs4, d24, j31, boxDouble42, boxDouble222, null, null, str3, label, boxInt, boxInt2, boxLong3, segmentRemainingMs, boxDouble3, segmentRemainingM, boxBoolean, false, false, coerceAtLeast222, num2, d25, l4, i13, l5, i14, l6, 384, null));
                    j33 = trackingService4.lastNotificationAtMs;
                    if (j20 - j33 < 5000) {
                    }
                    trackingService4.lastNotificationAtMs = j20;
                    d26 = trackingService4.totalDistanceM;
                    trackingService4.updateNotification(activeElapsedMs4, d26, label);
                    if (!component2.isEmpty()) {
                    }
                    obj2 = obj7;
                    mutex = mutex4;
                    Unit unit2222 = Unit.INSTANCE;
                    mutex.unlock(obj2);
                    return Unit.INSTANCE;
                }
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        Long boxLong4 = Boxing.boxLong(location.getTime());
        if (boxLong4.longValue() <= 0) {
            boxLong4 = null;
        }
        long longValue = boxLong4 != null ? boxLong4.longValue() : currentTimeMillis;
        if (f > 28.0f) {
            i8 = trackingService.poorGpsStreak;
            trackingService.poorGpsStreak = i8 + 1;
            Boxing.boxInt(i8);
        } else {
            trackingService.poorGpsStreak = 0;
            Unit unit3 = Unit.INSTANCE;
        }
        z = trackingService.smoothGps;
        if (z && location2 != null) {
            Long boxLong5 = Boxing.boxLong(location.getTime());
            if (boxLong5.longValue() <= 0) {
                boxLong5 = null;
            }
            long longValue2 = boxLong5 != null ? boxLong5.longValue() : currentTimeMillis;
            Long boxLong6 = Boxing.boxLong(location2.getTime());
            if (boxLong6.longValue() <= 0) {
                boxLong6 = null;
            }
            f2 = f;
            float f10 = f2 >= 60.0f ? 0.55f : f2 >= 35.0f ? 0.65f : ((double) location2.distanceTo(location)) / (((double) RangesKt.coerceAtLeast(longValue2 - (boxLong6 != null ? boxLong6.longValue() : currentTimeMillis), 1L)) / 1000.0d) <= 1.5d ? 0.7f : 0.85f;
            Location location19 = new Location(location);
            j2 = j;
            double d36 = f10;
            location19.setLatitude(location2.getLatitude() + ((location.getLatitude() - location2.getLatitude()) * d36));
            location19.setLongitude(location2.getLongitude() + ((location.getLongitude() - location2.getLongitude()) * d36));
            location3 = location19;
            trackingService.lastSmoothed = location3;
            location4 = trackingService.lastLoc;
            if (location4 != null) {
                Long boxLong7 = Boxing.boxLong(location4.getTime());
                if (boxLong7.longValue() <= 0) {
                    boxLong7 = null;
                }
                if (boxLong7 != null) {
                    j3 = boxLong7.longValue();
                    boxLong = Boxing.boxLong(j3);
                    if (boxLong.longValue() <= 0) {
                        boxLong = null;
                    }
                    long longValue3 = boxLong != null ? boxLong.longValue() : currentTimeMillis;
                    coerceAtLeast = RangesKt.coerceAtLeast(longValue - longValue3, 1L);
                    gpsTunnelEstimator = GpsTunnelEstimator.INSTANCE;
                    location5 = trackingService.lastGoodLoc;
                    i = trackingService.poorGpsStreak;
                    CoroutineScope coroutineScope7 = coroutineScope;
                    long j42 = longValue3;
                    j4 = currentTimeMillis;
                    Mutex mutex11 = mutex;
                    if (gpsTunnelEstimator.isTunnelExitJump(location5, location3, f2, i, coerceAtLeast)) {
                        trackingService.lastLoc = location3;
                        Unit unit4 = Unit.INSTANCE;
                        mutex11.unlock(null);
                        return unit4;
                    }
                    j5 = trackingService.totalSteps;
                    j6 = trackingService.stepsAtLastPoint;
                    long coerceAtLeast4 = RangesKt.coerceAtLeast(j5 - j6, 0L);
                    GpsTunnelEstimator gpsTunnelEstimator3 = GpsTunnelEstimator.INSTANCE;
                    i2 = trackingService.poorGpsStreak;
                    d = trackingService.lastGoodSpeedMps;
                    GpsTunnelEstimator.DeltaResult computeDeltaM = gpsTunnelEstimator3.computeDeltaM(location4, location3, f2, coerceAtLeast4, i2, d, coerceAtLeast);
                    double distanceM = computeDeltaM.getDistanceM();
                    trackingService.wasInPoorGps = computeDeltaM.getInPoorGps();
                    if (computeDeltaM.getHoldPosition()) {
                        location11 = trackingService.lastGoodLoc;
                        if (location11 != null) {
                            location12 = trackingService.lastGoodLoc;
                            Intrinsics.checkNotNull(location12);
                            location6 = location12;
                            d2 = distanceM / (coerceAtLeast / 1000.0d);
                            gpsTunnelEstimator2 = GpsTunnelEstimator.INSTANCE;
                            z2 = trackingService.wasInPoorGps;
                            if (!gpsTunnelEstimator2.isSpike(distanceM, d2, f2, z2)) {
                                try {
                                    trackingService.lastLoc = location3;
                                    Unit unit5 = Unit.INSTANCE;
                                    mutex11.unlock(null);
                                    return unit5;
                                } catch (Exception unused7) {
                                    obj2 = null;
                                    mutex = mutex11;
                                    Unit unit22222 = Unit.INSTANCE;
                                    mutex.unlock(obj2);
                                    return Unit.INSTANCE;
                                } catch (Throwable th10) {
                                    th = th10;
                                    obj2 = null;
                                    mutex = mutex11;
                                    mutex.unlock(obj2);
                                    throw th;
                                }
                            }
                            obj2 = null;
                            try {
                                j7 = trackingService.lastGoodGpsAtMs;
                                z3 = j4 - j7 > 75000;
                                z4 = trackingService.manualPaused;
                            } catch (Exception unused8) {
                            } catch (Throwable th11) {
                                th = th11;
                            }
                            try {
                                if (!z4) {
                                    try {
                                        z5 = trackingService.autoPauseEnabled;
                                        if (z5 && !z3 && !computeDeltaM.getInPoorGps()) {
                                            i3 = trackingService.poorGpsStreak;
                                            i4 = 3;
                                            if (i3 < 3) {
                                                ActivityTypes activityTypes = ActivityTypes.INSTANCE;
                                                str = trackingService.currentActivityType;
                                                boolean isBike = activityTypes.isBike(str);
                                                if (!isBike ? !(d2 >= 0.8d || distanceM >= 6.0d || (computeDeltaM.getUseSteps() && coerceAtLeast4 >= 8)) : !(d2 >= 1.5d || distanceM >= 10.0d)) {
                                                    long j43 = isBike ? 35000L : 45000L;
                                                    z7 = trackingService.isAutoPaused;
                                                    if (!z7) {
                                                        j8 = trackingService.lastMoveAtMs;
                                                        if (j4 - j8 >= j43) {
                                                            trackingService.setAutoPaused(true);
                                                        }
                                                    }
                                                }
                                                trackingService.lastMoveAtMs = j4;
                                                z6 = trackingService.isAutoPaused;
                                                if (z6) {
                                                    trackingService.setAutoPaused(false);
                                                }
                                            }
                                            z8 = trackingService.isAutoPaused;
                                            if (!z8) {
                                                z10 = trackingService.manualPaused;
                                                if (!z10) {
                                                    d6 = trackingService.totalDistanceM;
                                                    double d37 = d6 + distanceM;
                                                    trackingService.totalDistanceM = d37;
                                                    if (distanceM > 0.0d) {
                                                        d9 = trackingService.nextKmBeepAtM;
                                                        if (d37 >= d9) {
                                                            location9 = location3;
                                                            obj5 = null;
                                                            obj6 = coroutine_suspended;
                                                            d10 = distanceM;
                                                            location10 = location6;
                                                            d11 = d2;
                                                            j15 = coerceAtLeast;
                                                            coroutineScope2 = coroutineScope7;
                                                            f4 = f2;
                                                            trackingService3 = trackingService;
                                                            j16 = j4;
                                                            j17 = j42;
                                                            d12 = d6;
                                                            mutex3 = mutex11;
                                                            d13 = d37;
                                                            j18 = longValue;
                                                            j19 = j2;
                                                            d15 = trackingService3.nextKmBeepAtM;
                                                            if (d13 < d15) {
                                                            }
                                                        }
                                                    }
                                                    trackingService$handleLocation$1 = this;
                                                    i7 = i4;
                                                    obj4 = coroutine_suspended;
                                                    f3 = f2;
                                                    location7 = location3;
                                                    mutex = mutex11;
                                                    trackingService2 = trackingService;
                                                    d7 = distanceM;
                                                    location8 = location6;
                                                    d8 = d2;
                                                    j13 = longValue;
                                                    j14 = j2;
                                                    obj2 = null;
                                                    if (f3 <= 25.0f) {
                                                    }
                                                    pointEntity = new PointEntity(0L, j14, j13, location8.getLatitude(), location8.getLongitude(), f3, !location7.hasAltitude() ? Boxing.boxDouble(location8.getAltitude()) : null, d7, 1, null);
                                                    repo = trackingService2.getRepo();
                                                    trackingService$handleLocation$1.L$0 = mutex;
                                                    trackingService$handleLocation$1.L$1 = trackingService2;
                                                    trackingService$handleLocation$1.L$2 = location7;
                                                    trackingService$handleLocation$1.L$3 = location8;
                                                    trackingService$handleLocation$1.L$4 = pointEntity;
                                                    trackingService$handleLocation$1.J$0 = j4;
                                                    trackingService$handleLocation$1.label = i7;
                                                    if (repo.insertPoint(pointEntity, trackingService$handleLocation$1) != obj4) {
                                                    }
                                                }
                                            }
                                            obj3 = null;
                                            activeElapsedMs = trackingService.activeElapsedMs(j4);
                                            TrackingState trackingState3 = TrackingState.INSTANCE;
                                            j9 = trackingService.startedAtMs;
                                            Long boxLong8 = Boxing.boxLong(j9);
                                            d3 = trackingService.totalDistanceM;
                                            j10 = trackingService.totalSteps;
                                            Double boxDouble5 = Boxing.boxDouble(location6.getLatitude());
                                            Double boxDouble6 = Boxing.boxDouble(location6.getLongitude());
                                            str2 = trackingService.currentPlanType;
                                            z9 = trackingService.isAutoPaused;
                                            j11 = trackingService.splitStartElapsedMs;
                                            long coerceAtLeast5 = RangesKt.coerceAtLeast(activeElapsedMs - j11, 0L);
                                            num = trackingService.targetPaceSecPerKm;
                                            d4 = trackingService.goalDistanceM;
                                            l = trackingService.goalTimeMs;
                                            i5 = trackingService.splitCount;
                                            l2 = trackingService.lastSplitMs;
                                            i6 = trackingService.lapCount;
                                            l3 = trackingService.lastLapMs;
                                            trackingState3.update(new TrackingUiState(true, boxLong8, activeElapsedMs, d3, j10, boxDouble5, boxDouble6, null, null, str2, null, null, null, null, null, null, null, null, z9, true, coerceAtLeast5, num, d4, l, i5, l2, i6, l3, 261504, null));
                                            j12 = trackingService.lastNotificationAtMs;
                                            if (j4 - j12 >= 5000) {
                                                trackingService.lastNotificationAtMs = j4;
                                                activeElapsedMs2 = trackingService.activeElapsedMs(j4);
                                                d5 = trackingService.totalDistanceM;
                                                trackingService.updateNotification(activeElapsedMs2, d5, null);
                                            }
                                            trackingService.lastLoc = location3;
                                            Unit unit6 = Unit.INSTANCE;
                                            mutex11.unlock(null);
                                            return unit6;
                                        }
                                    } catch (Exception unused9) {
                                        mutex = mutex11;
                                        Unit unit222222 = Unit.INSTANCE;
                                        mutex.unlock(obj2);
                                        return Unit.INSTANCE;
                                    } catch (Throwable th12) {
                                        th = th12;
                                        mutex = mutex11;
                                        mutex.unlock(obj2);
                                        throw th;
                                    }
                                }
                                activeElapsedMs = trackingService.activeElapsedMs(j4);
                                TrackingState trackingState32 = TrackingState.INSTANCE;
                                j9 = trackingService.startedAtMs;
                                Long boxLong82 = Boxing.boxLong(j9);
                                d3 = trackingService.totalDistanceM;
                                j10 = trackingService.totalSteps;
                                Double boxDouble52 = Boxing.boxDouble(location6.getLatitude());
                                Double boxDouble62 = Boxing.boxDouble(location6.getLongitude());
                                str2 = trackingService.currentPlanType;
                                z9 = trackingService.isAutoPaused;
                                j11 = trackingService.splitStartElapsedMs;
                                long coerceAtLeast52 = RangesKt.coerceAtLeast(activeElapsedMs - j11, 0L);
                                num = trackingService.targetPaceSecPerKm;
                                d4 = trackingService.goalDistanceM;
                                l = trackingService.goalTimeMs;
                                i5 = trackingService.splitCount;
                                l2 = trackingService.lastSplitMs;
                                i6 = trackingService.lapCount;
                                l3 = trackingService.lastLapMs;
                                trackingState32.update(new TrackingUiState(true, boxLong82, activeElapsedMs, d3, j10, boxDouble52, boxDouble62, null, null, str2, null, null, null, null, null, null, null, null, z9, true, coerceAtLeast52, num, d4, l, i5, l2, i6, l3, 261504, null));
                                j12 = trackingService.lastNotificationAtMs;
                                if (j4 - j12 >= 5000) {
                                }
                                trackingService.lastLoc = location3;
                                Unit unit62 = Unit.INSTANCE;
                                mutex11.unlock(null);
                                return unit62;
                            } catch (Exception unused10) {
                                obj2 = obj3;
                                mutex = mutex11;
                                Unit unit2222222 = Unit.INSTANCE;
                                mutex.unlock(obj2);
                                return Unit.INSTANCE;
                            } catch (Throwable th13) {
                                th = th13;
                                obj2 = obj3;
                                mutex = mutex11;
                                mutex.unlock(obj2);
                                throw th;
                            }
                            i4 = 3;
                            z8 = trackingService.isAutoPaused;
                            if (!z8) {
                            }
                            obj3 = null;
                        }
                    }
                    location6 = location3;
                    d2 = distanceM / (coerceAtLeast / 1000.0d);
                    gpsTunnelEstimator2 = GpsTunnelEstimator.INSTANCE;
                    z2 = trackingService.wasInPoorGps;
                    if (!gpsTunnelEstimator2.isSpike(distanceM, d2, f2, z2)) {
                    }
                }
            }
            j3 = trackingService.lastPointTimeMs;
            boxLong = Boxing.boxLong(j3);
            if (boxLong.longValue() <= 0) {
            }
            if (boxLong != null) {
            }
            coerceAtLeast = RangesKt.coerceAtLeast(longValue - longValue3, 1L);
            gpsTunnelEstimator = GpsTunnelEstimator.INSTANCE;
            location5 = trackingService.lastGoodLoc;
            i = trackingService.poorGpsStreak;
            CoroutineScope coroutineScope72 = coroutineScope;
            long j422 = longValue3;
            j4 = currentTimeMillis;
            Mutex mutex112 = mutex;
            if (gpsTunnelEstimator.isTunnelExitJump(location5, location3, f2, i, coerceAtLeast)) {
            }
        }
        j2 = j;
        location3 = location;
        f2 = f;
        trackingService.lastSmoothed = location3;
        location4 = trackingService.lastLoc;
        if (location4 != null) {
        }
        j3 = trackingService.lastPointTimeMs;
        boxLong = Boxing.boxLong(j3);
        if (boxLong.longValue() <= 0) {
        }
        if (boxLong != null) {
        }
        coerceAtLeast = RangesKt.coerceAtLeast(longValue - longValue3, 1L);
        gpsTunnelEstimator = GpsTunnelEstimator.INSTANCE;
        location5 = trackingService.lastGoodLoc;
        i = trackingService.poorGpsStreak;
        CoroutineScope coroutineScope722 = coroutineScope;
        long j4222 = longValue3;
        j4 = currentTimeMillis;
        Mutex mutex1122 = mutex;
        if (gpsTunnelEstimator.isTunnelExitJump(location5, location3, f2, i, coerceAtLeast)) {
        }
    }
}
