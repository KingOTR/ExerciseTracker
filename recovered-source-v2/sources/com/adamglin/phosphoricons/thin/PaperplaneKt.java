package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Paperplane.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PaperPlane", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getPaperPlane", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_paperPlane", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaperplaneKt {
    private static ImageVector _paperPlane;

    public static final ImageVector getPaperPlane(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _paperPlane;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PaperPlane", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(234.43f, 202.08f);
        pathBuilder.lineTo(138.35f, 34.14f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -20.92f, 0.0f);
        pathBuilder.lineToRelative(-95.88f, 168.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 219.3f);
        pathBuilder.lineToRelative(92.0f, -31.08f);
        pathBuilder.lineToRelative(91.94f, 31.06f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 14.49f, -17.2f);
        pathBuilder.close();
        pathBuilder.moveTo(227.0f, 210.56f);
        pathBuilder.arcToRelative(3.94f, 3.94f, 0.0f, false, true, -4.47f, 1.16f);
        pathBuilder.lineTo(132.0f, 181.13f);
        pathBuilder.verticalLineTo(120.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f);
        pathBuilder.verticalLineToRelative(61.13f);
        pathBuilder.lineTo(33.37f, 211.74f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.85f, -5.69f);
        pathBuilder.lineToRelative(95.87f, -168.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.0f, 0.0f);
        pathBuilder.lineTo(227.47f, 206.0f);
        pathBuilder.arcTo(3.91f, 3.91f, 0.0f, false, true, 227.0f, 210.56f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _paperPlane = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
