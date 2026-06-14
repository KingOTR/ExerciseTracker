package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Contactlesspayment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ContactlessPayment", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getContactlessPayment", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_contactlessPayment", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ContactlesspaymentKt {
    private static ImageVector _contactlessPayment;

    public static final ImageVector getContactlessPayment(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _contactlessPayment;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ContactlessPayment", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(224.0f, 128.0f);
        pathBuilder.arcToRelative(96.0f, 96.0f, 0.0f, true, true, -96.0f, -96.0f);
        pathBuilder.arcTo(96.0f, 96.0f, 0.0f, false, true, 224.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(128.0f, 24.0f);
        pathBuilder2.arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f);
        pathBuilder2.arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(128.0f, 216.0f);
        pathBuilder2.arcToRelative(88.0f, 88.0f, 0.0f, true, true, 88.0f, -88.0f);
        pathBuilder2.arcTo(88.1f, 88.1f, 0.0f, false, true, 128.0f, 216.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(97.07f, 100.26f);
        pathBuilder2.arcToRelative(59.33f, 59.33f, 0.0f, false, true, 0.0f, 55.48f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -14.14f, -7.48f);
        pathBuilder2.arcToRelative(42.79f, 42.79f, 0.0f, false, false, 0.0f, -40.52f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 14.14f, -7.48f);
        pathBuilder2.close();
        pathBuilder2.moveTo(153.07f, 68.26f);
        pathBuilder2.arcToRelative(126.67f, 126.67f, 0.0f, false, true, 0.0f, 119.54f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 139.0f, 180.23f);
        pathBuilder2.arcToRelative(110.62f, 110.62f, 0.0f, false, false, 0.0f, -104.46f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 14.12f, -7.54f);
        pathBuilder2.close();
        pathBuilder2.moveTo(125.07f, 84.26f);
        pathBuilder2.arcToRelative(93.0f, 93.0f, 0.0f, false, true, 0.0f, 87.52f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -14.12f, -7.52f);
        pathBuilder2.arcToRelative(77.0f, 77.0f, 0.0f, false, false, 0.0f, -72.48f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 14.12f, -7.52f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _contactlessPayment = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
