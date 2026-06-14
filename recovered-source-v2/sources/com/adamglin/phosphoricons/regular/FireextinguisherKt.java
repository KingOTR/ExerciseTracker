package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Fireextinguisher.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FireExtinguisher", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getFireExtinguisher", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_fireExtinguisher", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FireextinguisherKt {
    private static ImageVector _fireExtinguisher;

    public static final ImageVector getFireExtinguisher(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _fireExtinguisher;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FireExtinguisher", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(218.3f, 48.34f);
        pathBuilder.lineToRelative(-60.68f, -18.2f);
        pathBuilder.lineToRelative(30.0f, -15.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 180.42f, 0.85f);
        pathBuilder.lineTo(134.0f, 24.05f);
        pathBuilder.arcToRelative(80.08f, 80.08f, 0.0f, false, false, -78.0f, 80.0f);
        pathBuilder.lineTo(56.0f, 208.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.lineTo(72.0f, 176.0f);
        pathBuilder.lineTo(88.0f, 176.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder.lineTo(184.0f, 104.0f);
        pathBuilder.arcToRelative(48.07f, 48.07f, 0.0f, false, false, -40.0f, -47.32f);
        pathBuilder.lineTo(144.0f, 42.75f);
        pathBuilder.lineToRelative(69.7f, 20.91f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 4.6f, -15.32f);
        pathBuilder.close();
        pathBuilder.moveTo(72.0f, 160.0f);
        pathBuilder.lineTo(72.0f, 104.0f);
        pathBuilder.arcToRelative(64.07f, 64.07f, 0.0f, false, true, 56.0f, -63.48f);
        pathBuilder.lineTo(128.0f, 56.68f);
        pathBuilder.arcTo(48.07f, 48.07f, 0.0f, false, false, 88.0f, 104.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.close();
        pathBuilder.moveTo(168.0f, 232.0f);
        pathBuilder.lineTo(104.0f, 232.0f);
        pathBuilder.lineTo(104.0f, 176.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.close();
        pathBuilder.moveTo(168.0f, 104.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.lineTo(104.0f, 160.0f);
        pathBuilder.lineTo(104.0f, 104.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, true, 64.0f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _fireExtinguisher = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
